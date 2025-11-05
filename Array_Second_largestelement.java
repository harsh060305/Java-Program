import java.util.Scanner;

public class Array_Second_largestelement {

    public static int array(int arr[],int n){
        int largest=0, slargest=0;
        for (int i=0;i<n;i++){
            if(arr[i]>largest)
            largest=arr[i];
        }
        for(int j=0;j<n;j++){
            if(arr[j]>slargest && arr[j]!=largest)
            slargest=arr[j];
        }return slargest;
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
        System.out.println("Second largest element is : "+array(arr,n));
    }
}
