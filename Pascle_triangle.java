import java.util.Scanner;

public class Pascle_triangle {

    public static int nCr(int n,int r){
        int res=1;
        for (int i = 0; i < r; i++) {
            res=res*(n-i);
            res=res/(i+1);
            
        }return res;
    }

    public static void pascle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++){
                int element = (int)nCr(i-1,j-1);
                System.out.print(element + " ");
            }System.out.println();
            
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row : ");
        int n=sc.nextInt();
        System.out.println("Pascle triangle is : ");
        pascle(n);
    }
/*
 * List<List<Integer>> totalrows = new ArrayList<>();
 * 
 * for(int i=0;i<numRows;i++){
 * 
 * List<Integer> res = new ArrayList<>();
        long val=1;
        for(int j=0;j<=rowIndex;j++){
            res.add((int)val);
            val=val*(rowIndex-j)/(j+1);
        }totalrows.add(res);
 * 
 * }
 * 
 */

}
