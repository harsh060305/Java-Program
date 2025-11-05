public class Arraysort_0_1_2 {

    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;

        // Count the occurrences of 0s, 1s, and 2s
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        // Update the array with the sorted colors
        for (int j = 0; j < count0; j++) {
            nums[j] = 0;
        }
        for (int j = count0; j < count0 + count1; j++) {
            nums[j] = 1;
        }
        for (int j = count0 + count1; j < n; j++) {
            nums[j] = 2;
        }

        // Print the sorted array
        for (int k = 0; k < n; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println(); // For a new line after printing the array
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0, 2, 0, 1, 2};
        Arraysort_0_1_2 sorter = new Arraysort_0_1_2(); // Create an instance
        sorter.sortColors(arr); // Call the sortColors method
    }
}
