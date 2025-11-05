import java.util.Scanner;

public class StringPalindrome2 {
    public static boolean ispalindrome(String s){
        int n = s.length();
        if(n==0) return false;
        s=s.toLowerCase();
        int start=0;
        int end=n-1;
        while(start<end){
            char sch=s.charAt(start);
            char ech=s.charAt(end);
            if(!((sch>='a' && sch<='z') || (sch>='0' && sch<='9'))){
                start++;
            }
            else if(!((ech>='a' && ech<='z') || (ech>='0' && ech<='9'))){
                end--;
            }else{
                if(sch != ech){
                    return false;
                }
                start++;
                end--;

            }


        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        System.out.println(ispalindrome(str));
    }
}
