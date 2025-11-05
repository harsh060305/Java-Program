import java.util.Scanner;

public class Find_Peak_Element {

    //A peak element is an element that is strictly greater than its neighbors.
    public static int linear(int[] nums){
        int n=nums.length;

        if(n==1) return nums[0];
        if(nums[0] > nums[1]) return nums[0];
        if(nums[n-1] > nums[n-2]) return nums[n-1];

        int low=1,high=n-2 , mid ;
        while(low<=high){
            mid= (low+high)/2;

            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1] ) return mid;

            //remove the left part
            else if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }

            else high=mid-1;

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






/*If n == 1: This means the array size is 1. If the array contains only one element, we will return that index i.e. 0.
If arr[0] > arr[1]: This means the very first element of the array is the peak element. So, we will return the index 0.
If arr[n-1] > arr[n-2]: This means the last element of the array is the peak element. So, we will return the index n-1.
Place the 2 pointers i.e. low and high: Initially, we will place the pointers excluding index 0 and n-1 like this: low will point to index 1, and high will point to index n-2 i.e. the second last index.
Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
mid = (low+high) // 2 ( ‘//’ refers to integer division)
Check if arr[mid] is the peak element:
If arr[mid] > arr[mid-1] and arr[mid] > arr[mid+1]: If this condition is true for arr[mid], we can conclude arr[mid] is the peak element. We will return the index ‘mid’.
If arr[mid] > arr[mid-1]: This means we are in the left half and we should eliminate it as our peak element appears on the right. So, we will do this:
low = mid+1.
Otherwise, we are in the right half and we should eliminate it as our peak element appears on the left. So, we will do this: high = mid-1. This case also handles the case for the index ‘mid’ being a common point of a decreasing and increasing sequence. 
It will consider the left peak and eliminate the right peak. */
