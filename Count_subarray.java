import java.util.Scanner;

public class Count_subarray{

    public static int subarray(int nums[] ,int k){
        int n=nums.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for(int j=i;j<n;j++){
                sum=sum+nums[j];
                if(sum==k)
                count++;
            }
            
        }return count;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of element : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the result : ");
        int k=sc.nextInt();
        System.out.println("total count is : "+subarray(arr,k));
    }
}