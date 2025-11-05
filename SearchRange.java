import java.util.Scanner;

// Find First and Last Position of Element in Sorted Array
public class SearchRange{

    public static int[] binary(int[] nums,int target){
        int n=nums.length;
        int[] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        for (int i = 0; i < n; i++) {
            if(nums[i]==target){
                if(arr[0]==-1){
                    arr[0]=i;
                    arr[1]=i;
                }else{
                    arr[1]=i;
                }

            }
            
        }return arr;

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

             int temp[]=binary(arr,target);

             System.out.println("Item found at index : ");
             for (int i = 0; i < temp.length; i++) {
                 
                System.out.print(temp[i]+" ");
            }   
    }
}
