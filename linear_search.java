import java.util.Scanner;

public class linear_search {

    public static int linear(int[] nums,int target){
        int n=nums.length;
        for (int i = 0; i < n; i++) {

            if(nums[i]==target)
            return i;
        }return -1;
       

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

             int temp=linear(arr,target);
             System.out.println("Item found at index : "+ temp);
    }
}
