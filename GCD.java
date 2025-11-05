import java.util.Scanner;

public class GCD{

    public static int calc(int a,int b){
        int i;
        if(a>b){
            i=b;
        }else{
            i=a;
        }
        for(int j=i;j>1;j--)
        {
            if(a%j==0 && b%j==0){
                return j;
            }
        }return 1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1=sc.nextInt();
        System.out.println("Enter second number : ");
        int n2=sc.nextInt();

        System.out.println("GCD is : "+ calc(n1,n2));


    }
}