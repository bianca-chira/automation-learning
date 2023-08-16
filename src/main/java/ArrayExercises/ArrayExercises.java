package ArrayExercises;

public class ArrayExercises {
    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        }
        return nums[nums.length - 1] == 6;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
        }
        return false;
    }
    public static int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] middleArray = {a[1], b[1]};
        return middleArray;
    }



}
