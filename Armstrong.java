import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        int temp=num;
        int sum=0;
        int n;
        while(temp!=0)
        {
            n=temp%10;
            sum=n*n*n+sum;
            temp=temp/10;

        }
        if(num==sum)
        {
            System.out.println(num +" is armstrong number.");
        }else
        {
            System.out.println(num +" is not armstrong number.");
        }

    }
}