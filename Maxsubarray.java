public class Maxsubarray {
    public static void maxarray(int[] nums){
        int largestSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            largestSum = Math.max(largestSum,currSum);
        }System.out.println("max subaarray is : "+largestSum);
    }
    public static void main(String[] args) {
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        maxarray(arr);
    }
}
