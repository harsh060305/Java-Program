
public class Singleelement {

    //In this every element is in pair we have to find the single element

    
    public static int element(int[] nums) {
        int n=nums.length;

        if(n==1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        int low=1,high=n-2 , mid ;
        while(low<=high){
            mid= (low+high)/2;

            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1] ) return nums[mid];

            //remove the left part
            else if((mid%2==1 && nums[mid] == nums[mid-1]) || (mid%2==0 && nums[mid] == nums[mid+1])) {
                low=mid+1;
            }else high=mid-1;

        }return -1;

    }

    public static void main(String[] args) {
        int[] arr={1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int ans = element(arr);
        System.out.println("The single element is: " + ans);
    }
}





