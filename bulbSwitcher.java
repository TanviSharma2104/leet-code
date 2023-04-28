class Solution {
    public int bulbSwitch(int n) {
        // int[] arr=new int[n+1];
        // if(n==0){
        //     return 0;
        // }
        // else{
        //     Arrays.fill(arr,1);
        //     for(int i=2;i<=n;i++){
                
        //         // for(int j=i;j<n;j++){
        //         //     if((j+1)%i==0){
        //         //         arr[j]=~(arr[j]);
        //         //     }
        //         // }
                
        //         for(int j=i;j<=n;j=j+i){
        //             arr[j]=~(arr[j]);
                    
        //         }
                

        //     }

        // }
        // int c=0;
        // for(int i=1;i<=n;i++){
        //     if(arr[i]==1){
        //         c++;
        //     }
        // }
        // return c;
        
        return (int)Math.sqrt(n);
        
    }
}
