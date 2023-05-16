class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(String i :operations){
            if(i.equals("++X")|| i.equals("X++")){
                a++;
            }
            else if(i.equals("--X")|| i.equals("X--")){
                a--;
            }
        }
        return a;
    }
}
