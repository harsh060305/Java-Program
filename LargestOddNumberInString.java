public class LargestOddNumberInString {
    
    public static void main(String[] args) {
        String num = "543544";

        // int temp=Integer.parseInt(num);

        // while(temp>0){
        //     if(temp%2!=0){
        //         System.out.println(temp);
        //         break;
        //     }else{
        //         temp=temp/10;
        //     }
        // }

        int n=num.length();
        for(int i = n-1;i>=0;i--){
            char ch=num.charAt(i);
            int temp = Integer.parseInt(String.valueOf(ch));
            if(temp%2 != 0 ){
                String abc = num.substring(0,i+1);
                System.out.print(abc);
                break;
            }
        }




    }
}
