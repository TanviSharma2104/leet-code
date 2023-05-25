class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i],1);
            }
            
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j]) && map.get(nums2[j])>0){
                ans.add(nums2[j]);
                map.put(nums2[j],map.get(nums2[j])-1);
            }
        }
        int[] aa=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            aa[k]=ans.get(k);
        }
        return aa;
    }
}
