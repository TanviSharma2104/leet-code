class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] arr=new int[sentences.length];
        int i=0;
        for(String s:sentences){
            int c=1;
            for(int j=0;j<s.length();j++){
                String b=""+s.charAt(j);
                if(b.equals(" ")){
                    c++;
                }
            }
            c++;
            arr[i]=c;
            i++;
        }
        Arrays.sort(arr);
        return arr[sentences.length-1]-1;
    }
}
