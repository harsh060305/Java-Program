import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] arr) {
        // code here
        Arrays.sort(arr);
        int res=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) continue;
            
            if(arr[i]==res){
                res++;
            }
        }return res;
    }

    // Main method to test the Solution
    public static void main(String[] args) {
        MissingNumber sol = new MissingNumber();
        int[] arr = {0, -1, 3, 1};
        int missing = sol.missingNumber(arr);
        System.out.println("Missing number: " + missing);
    }
}
