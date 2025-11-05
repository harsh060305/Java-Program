/*You are given 'N’ roses and you are also given an array 'arr'  where 'arr[i]'  denotes that the 'ith' rose will bloom on the 'arr[i]th' day.
You can only pick already bloomed roses that are adjacent to make a bouquet. You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet.
Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses. Return -1 if it is not possible. */

import java.util.*;

public class Boukets {
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length;
        int cnt = 0;
        int noOfB = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;

    }
       
    public static int roseGarden(int[] arr, int k, int m) {
        int n=arr.length;
        if(n<k*m) return -1;

        int m1=Integer.MAX_VALUE,m2=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            m1=Math.max(m1,arr[i]);
            m2=Math.max(m2,arr[i]);
        }
        int low=m1,mid,high=m2;
        while(low<=high){
            mid=(low+high)/2;
            if possible(arr,mid,k,m){
                high =mid-1;
            }else{
                low=mid+1;
            }
        }return low;
        
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = roseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}


long val = (long) m * k;
        int n = arr.length; 
        if (val > n) return -1; 
        
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        
        int low = mini, high = maxi;
        while (low <= high) {
            
            int mid = (low + high) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;