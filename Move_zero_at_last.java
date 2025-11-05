import java.util.Scanner;

public class Move_zero_at_last {

    public static int[] shift(int arr[],int n){
        int count=0;
       for(int i=0;i<n;i++){
           if(arr[i]!=0){
               arr[count++]=arr[i];
           }
       }while(count<n){
        arr[count++]=0;
       }
        return arr;
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
        int[] num=shift(arr,n);
        System.out.println("new array is : ");
        for(int i=0;i<n;i++){
            System.out.print(num[i]);
        }
        
    }
}

