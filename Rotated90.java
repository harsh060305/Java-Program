import java.util.*;

public class Rotated90{

    public static int[][] rotate(int [][] nums){
        int n=nums.length;
        int[][] array=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[j][n-1-i]=nums[i][j];
            }
        }return array;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        

        int[][] arr=new int[n][n];
        System.out.println("Enter the element or 2D array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("After rotation new array is : ");
        int[][] a=rotate(arr);
        System.out.println(Arrays.deepToString(a));
    }
}