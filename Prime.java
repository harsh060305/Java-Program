import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int count=0;

        if(n==0||n==1){
            System.out.println("not Prime");
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    count++;
                }
            }if(count>=1){
                System.out.println("not prime");
            }else{
                System.out.println("prime");
            }
            
        }

    }
}