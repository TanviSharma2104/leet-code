class OrderedStream {
    // int ptr;
    // String[] res;
    // public OrderedStream(int n) {
    //     ptr=0;
    //     res=new String[n];
    // }
    
    // public List<String> insert(int idKey, String value) {
    //     List<String> li=new ArrayList<>();
    //     res[idKey-1]=value;
    //     while(ptr<res.length && res[ptr]!=null){
    //         li.add(res[ptr]);
    //         ptr++;
    //     }
    //     return li;

    // }

    private String[] data;
    private int ptr;

    public OrderedStream(int n) {
        data = new String[n + 1];
        ptr = 1;
    }

    public String[] insert(int idKey, String value) {
        data[idKey] = value;
        List<String> res = new ArrayList<>();
        for (int i = ptr; i < data.length; i++) {
            if (data[i] != null) {
                res.add(data[i]);
            } else {
                ptr = i;
                break;
            }
        }
        return res.toArray(new String[0]);
    }

}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
