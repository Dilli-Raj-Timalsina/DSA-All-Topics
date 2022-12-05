public class FirstAndLastInArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 3, 3, 3, 3, 3, 3, 4, 5, 6};
        int target = 3;
        int ans[] = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        System.out.println(ans);

    }

    static int findFirst(int[] nums, int target) {
        int ans1 = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans1 = mid;
            } else if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans1;
    }

    static int findLast(int[] nums, int target) {
        int ans2 = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans2 = mid;
            } else if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans2;
    }
}
