class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int area=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int rm=i;
                int height=arr[st.pop()];
                
                if(st.isEmpty()){
                    int a=rm*height;
                    area=Math.max(area,a);

                }
                else{
                    int lm=st.peek();
                    int a=(rm-lm-1)*height;
                    area=Math.max(area,a);
                }
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int rm=arr.length;
                int height=arr[st.pop()];
                
                if(st.isEmpty()){
                    int a=rm*height;
                    area=Math.max(area,a);

                }
                else{
                    int lm=st.peek();
                    int a=(rm-lm-1)*height;
                    area=Math.max(area,a);
                }

        }
        return area;
        
    }
}
