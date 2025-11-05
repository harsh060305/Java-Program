public class SortedAndRotatedMinimum {
    public int findMin(int[] arr) {
        
        int n=arr.length;
        int low=0;
        int high=n-1;
        
        while(low<high){
        
        if(arr[low]<arr[high]){
        return arr[low];

        }
            
        int mid=low +( high-low)/2;
        
        if(arr[mid]>arr[high]){
            low=mid+1;
        }else{
            high=mid;
        }
    
        


        }return arr[low];
        
    }

    public static void main(String[] args){
        
        SortedAndRotatedMinimum sol = new SortedAndRotatedMinimum();
        
        int[] arr = {4,5,6,7,0,1,2};
        
        int result = sol.findMin(arr);
        
        System.out.println("Minimum element in the array = " + result);
    }
}
