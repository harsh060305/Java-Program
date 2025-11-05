
import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        //print the sum of array except that particular index
        int sum=0;
        int arr[] = {3,6,4,8,9};
        for(int each:arr){
            sum += each;
        }
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = sum-arr[i];

        }System.out.println(Arrays.toString(arr));

    }
}
