import java.util.Scanner;

public class Uppercase {
    // convert the first character of each word into upper case
    public static void Ucase(String str){
        int n=str.length();
        StringBuilder ab =new StringBuilder();
        char ch=Character.toUpperCase(str.charAt(0));
        ab.append(ch);
        
        for (int i = 1; i < n; i++) {
            if(str.charAt(i)==' '){
                ab.append(str.charAt(i)); //store the space

                ch=Character.toUpperCase(str.charAt(i+1));  //convert he char into upper case
                ab.append(ch);
            }else{
                ab.append(str.charAt(i));
            }
            
        }System.out.println(ab);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter : ");
        String str=sc.nextLine();
        Ucase(str);

    }
}
