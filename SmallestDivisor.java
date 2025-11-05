
public class SmallestDivisor {
    public static int sumByD(int[] arr, int div) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil(arr[i]/div);
            
        }return sum;
    }
    public static int smallestDivisor(int[] arr, int limit) {
        int n=arr.length;
        if(n>limit) return -1;

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,arr[i]);
        }int low=1, high=maxi,mid=0;
        
        while(low<=high){
            mid=(low+high)/2;
            if(sumByD(arr, mid) <= limit){
                high=mid+1;
            }else low=mid+1;
        }return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}



