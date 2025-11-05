import java.util.Scanner;

public class StringPalindrome {
    public static boolean ispalindrome(String str){
        int n=str.length();
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }else{
                return true;
            }
            
        }return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        System.out.println(ispalindrome(str));
    }
}
