import java.util.Scanner;

public class Pascle_row {

    public static int nCr(int n,int r){
        int res=1;
        for (int i = 0; i < r; i++) {
            res=res*(n-i);
            res=res/(i+1);
            
        }return res;
    }

    public static void pascle(int n){
        for (int i = 1; i <= n; i++) {
            int element = (int)nCr(n-1,i-1);
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row number : ");
        int n=sc.nextInt();
        System.out.println("Elements of row "+n+ " is : ");
        pascle(n);
    }

    /*List<Integer> res = new ArrayList<>();
        long val=1;
        for(int j=0;j<=rowIndex;j++){
            res.add((int)val);
            val=val*(rowIndex-j)/(j+1);
        }return res;*/
}
