public class MaxCircularSum {
    
       public static int maxCircularSum(int arr[]) {
        // code here
        int tsum=0;
        int minsum=Integer.MAX_VALUE;
        int min=0;
        int maxsum=Integer.MIN_VALUE;
        int max=0;
        
        for(int i=0;i<arr.length;i++){
            
            tsum += arr[i];
            
            //for minsubarray
            min=Math.min(arr[i],arr[i]+min);
            minsum=Math.min(min,minsum);
            
            //for maxsubarray
            max=Math.max(arr[i],arr[i]+max);
            maxsum=Math.max(max,maxsum);
            
            
        }
        if(maxsum<0) return maxsum;
        
        return Math.max(maxsum,tsum-minsum);
    }
    public static void main(String[] args) {
        int[] arr={-4,-5,-5,-6,-8};
        System.out.println(maxCircularSum(arr));
    }
}
