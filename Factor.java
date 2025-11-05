import java.util.Scanner;

public class Factor {

    public static void fact(int n,int i){
        
        if(i<=n){
            if (n%i==0){
                System.out.print(i +" ");
            }fact(n,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.print("factor of "+n+" is :");
        fact(n,1);
    }
}
