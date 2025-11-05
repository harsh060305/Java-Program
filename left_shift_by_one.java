import java.util.Scanner;

public class left_shift_by_one {

    public static void shift(int arr[],int n){
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }arr[n-1]=temp;
        System.out.println("After left shift array is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

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
        shift(arr,n);
    }
}

