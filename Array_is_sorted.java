import java.util.Scanner;

public class Array_is_sorted {

    public static boolean array(int arr[],int n){
        
        for (int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
            
        }return true;
        
    }
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of element : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(array(arr,n));
    }
}
