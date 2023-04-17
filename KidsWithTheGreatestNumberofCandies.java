
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr=new ArrayList<>();
        //boolean[] arr= new boolean[candies.length];
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int j=0;j<candies.length;j++){
            if((candies[j]+extraCandies)>=max){
                arr.add(true);
                //arr[j]=true;
            }
            else{
                arr.add(false);
                //arr[j]=false;
            }
        }
        //List<Boolean> myList = Booleans.asList(arr);
        //return mylist;
        //List<Boolean> booleansList = Arrays.asList(arr);
        return arr;
        
    }
}
