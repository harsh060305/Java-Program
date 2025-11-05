import java.util.*;

public class LongestConsecutive {

    public static int lead(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int maxLength = 1; // To count at least one element
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            // Check if the current number is consecutive
            if (nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                currentLength++;
            } else {
                maxLength = Squareofsome.max(maxLength, currentLength);
                currentLength = 1; // Reset for a new sequence
            }
        }
        
        // Final check for the last sequence
        maxLength = Squareofsome.max(maxLength, currentLength);
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of the longest consecutive sequence: " + lead(arr));
    }
}
