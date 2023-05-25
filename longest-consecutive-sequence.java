class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        int i=1;
        int max=1;
        if(nums.length==0 || nums==null){
            return 0;
        }

        if(nums.length==1){
            return 1;
        }
        while(i<nums.length){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    c++;
                    
                }else{
                    max=Math.max(c,max);
                    c=1;
                    
                }
            }
            i++;
            // if(nums[i]==nums[i-1]+1 ){
            //     c++;
            //     i++;
            //     max=Math.max(c,max);
            // }
            // else{
            //     c=1;
            //     i++;
            // }
            
        }
        max=Math.max(c,max);
        
        return max;

        // if (nums == null || nums.length == 0)
        //     return 0;

        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums)
        //     set.add(num);

        // int maxLen = 0;
        // for (int num : nums) {
        //     // Check if the current number is the start of a new sequence
        //     if (!set.contains(num - 1)) {
        //         int currNum = num;
        //         int currLen = 1;

        //         // Find the length of the consecutive sequence
        //         while (set.contains(currNum + 1)) {
        //             currNum++;
        //             currLen++;
        //         }

        //         maxLen = Math.max(maxLen, currLen);
        //     }
        // }

        // return maxLen;
    }
}
