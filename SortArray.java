import java.sql.SQLOutput;

public class SortArray {
    public static void main(String[] args) {
        int[] nums = {100, 5, 0, 20, 15, 8, 60, 37};
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i+1]) {
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for( int i : nums) {
            System.out.print(i + " ");
        }
    }
}
