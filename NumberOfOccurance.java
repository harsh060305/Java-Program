public class NumberOfOccurance {
    int countFreq(int[] arr, int target) {
        // code here
    
        return upperBound(arr, target) - lowerBound(arr, target);
        
    }
    
    static int lowerBound(int[] arr,int target){
        
        int n=arr.length;
        int res=n;
        int low=0;
        int high=n-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }return res;
    }
    
    static int upperBound(int[] arr,int target){
        
        int n=arr.length;
        int res=n;
        int low=0;
        int high=n-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }return res;
    }

    public static void main(String[] args){
        
        NumberOfOccurance sol = new NumberOfOccurance();
        
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        
        int result = sol.countFreq(arr, target);
        System.out.println("Count of " + target + " = " + result);
    }
}
