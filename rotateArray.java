import java.util.*;

public class rotateArray {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<k;i++){
            int temp=nums[n-1];
            for(int j=n-2;j>=0;j--){
                nums[j+1]=nums[j];
            }
            nums[0]=temp;

        }
        
    }
    public static void reverse(int start,int end,int nums[]){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        int k=2;
        // rotate(nums,k);
        // System.out.println(Arrays.toString(nums));
        int offset = k % nums.length;

        reverse(0,nums.length-1,nums);
        reverse(0,offset-1,nums);
        reverse(offset,nums.length-1,nums);
        System.out.println(Arrays.toString(nums));



    }
}
