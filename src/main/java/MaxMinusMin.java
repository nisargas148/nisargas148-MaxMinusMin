import java.util.List;
import java.util.Collections;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums a List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums) {
        // Check if the list is empty to avoid throwing an exception
        if (nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        // Get the max and min values from the list
        int max = Collections.max(nums);
        int min = Collections.min(nums);

        // Return the difference between the max and min values
        return max - min;
    }
}
