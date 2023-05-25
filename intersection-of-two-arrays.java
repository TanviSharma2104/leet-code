class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                ans.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int[] aa=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            aa[k]=ans.get(k);
        }
        return aa;
    

    }
}
