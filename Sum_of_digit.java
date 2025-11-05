import java.util.Scanner;

public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int sum=0;
        int num=0;

        while(n>0)
        {
            num=n%10;
            sum=sum+num;
            n=n/10;
        }
        System.out.println("Sum of digit is "+ sum);

    }
    
}
