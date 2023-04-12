class Solution {
    public int removeElement(int[] nums, int val) {
        int c=nums.length;
        for(int i=0;i<c;i++){
            if(nums[i]==val){
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                c--;
                i--;
            }
        }
        return c;
        
    }
}

// int[] nums = [...]; // Input array
// int val = ...; // Value to remove
// int[] expectedNums = [...]; // The expected answer with correct length.
//                             // It is sorted with no values equaling val.

// int k = removeElement(nums, val); // Calls your implementation

// assert k == expectedNums.length;
// sort(nums, 0, k); // Sort the first k elements of nums
// for (int i = 0; i < actualLength; i++) {
//     assert nums[i] == expectedNums[i];
// }



