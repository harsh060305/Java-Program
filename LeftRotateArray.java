
import java.util.Arrays;

public class LeftRotateArray {
    
    //Left rotation
    //so the left part goes backword....
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int n=nums.length;
        int[] brr = new int[n];
        k=k%n;
        int d=0;

        for (int i = k; i < n; i++) {
            brr[d]=nums[i];
            d++;
        }
        for (int i = 0; i < k; i++) {
            brr[d]=nums[i];
            d++;            
        }
        for(int i=0;i<n;i++){
            nums[i]=brr[i];
        }
        System.out.println(Arrays.toString(nums));

    }
}
