import java.util.Scanner;

public class palindrome {

    public static void check(int num){
        int temp=num;
        int rev=0;
        int n=0;

        while(temp>0)
        {
            n=temp%10;
            rev=(rev*10)+n;
            temp=temp/10;
        }

        if(rev==num)
        {
            System.out.println("Number is palindrome");
        }else
        {
            System.out.println("Number is not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        check(num);
    }
    
}
