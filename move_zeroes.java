/*

    Given an array nums, write a function to move all 0's to the end of it while
    maintaining the relative order of the non-zero elements.

    For example, given nums = [0, 1, 0, 3, 12], after calling your function,
    nums should be [1, 3, 12, 0, 0].

    Note:
    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.

*/

public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // find a zero
            if (nums[i] == 0) {
                // find next closest non-zero
                for (int j=i; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        //swap
                        int backup = nums[i];
                        nums[i] = nums[j];
                        nums[j] = backup;
                        break;
                    }
                }
            }
        }
    }
}
