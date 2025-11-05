import java.util.Scanner;

public class Find_min {

    //Find Minimum in Rotated Sorted Array
    public static int linear(int[] nums){
        int n=nums.length;
        for (int i = 0; i < n-1; i++) {

            if(nums[i+1]<nums[i])return i+1;
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
            
             int temp=linear(arr);
             System.out.println("Item found at index : "+ temp);
    }
}