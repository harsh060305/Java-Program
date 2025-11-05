import java.util.*;

public class Perfect_square{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
         int n=sc.nextInt();
         int x=(int)Squareofsome.sqrt(n);

         if((x*x)==n)
        {
            System.out.println(n +" is perfect square.");
        }else
        {
            System.out.println(n +" is not perfect square.");
        
        }
    }

}
