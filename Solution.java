import java.util.ArrayList;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // Length of array without duplicates
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        // Initialize ArrayList with values
        ArrayList<Integer> arr = new ArrayList<>();
        int[] inputValues = {1, 2, 2, 3, 4, 4, 5, 6};
        for (int val : inputValues) {
            arr.add(val);
        }

        // Convert to array
        int arr2[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arr2[i] = arr.get(i);
        }

        // Call method
        int newLength = obj.removeDuplicates(arr2);

        // Print result
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
