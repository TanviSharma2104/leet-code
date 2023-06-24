class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int max=(gain[0]>0?gain[0]:0);
       int[] path=new int[gain.length];
       path[0]=gain[0];
       
       for(int i=1;i<n;i++){
           path[i]=path[i-1]+gain[i];
           if(path[i]>max){
               max=path[i];
           }
       } 
       return max;
    }
}
