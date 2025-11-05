import java.util.Scanner;

public class Squareofsome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        
        int squareofsum=0,squareofdigit=0,sum,difference;

        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            squareofdigit += (int) Squareofsome.pow(i,2);

        }squareofsum =(int) Squareofsome.pow(sum,2);
        difference=squareofsum-squareofdigit;
        System.out.println("Difference is : "+ difference);


    }
}
