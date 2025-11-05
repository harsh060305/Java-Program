import java.util.Scanner;

public class lower_bound {

    public static int binary(int[] nums,int target){
        int n=nums.length;
        int low=0;int high=n-1;int mid;
        int ans=0;

        while(low<=high){
            mid=(low+high)/2;

            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;

            }
            else
                low=mid+1;
        }return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
             System.out.println("Enter the size of array : ");
             int n=sc.nextInt();
             System.out.println("Enter the element of array : ");
             int[] arr=new int[n];
             for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();                 
             }
             System.out.println("Enter the target to be search");
             int target=sc.nextInt();

             int temp=binary(arr,target);
             System.out.println("Item found at index : "+ temp);
    }
}
