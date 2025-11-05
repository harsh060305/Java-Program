class ShuffleString {
    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        char[] ans = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            int idx=indices[i];
            char ch=s.charAt(i);
            ans[idx]=ch;
        }
        String res=new String(ans);
        
        System.out.println(res);
        

        // int n=s.length();
             
        // String temp="";
        // int i=0;
        // while(i<m){
        //     char ch=s.charAt(indices[i]);
        //     temp += Character.toString(ch);
        //     i++;
        // }
        // return temp;

        

    }
}