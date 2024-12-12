package BinarySearch;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        long low = 1;
        long high = Math.max(1,num/2);

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid*mid == num)
                return true;
            if (mid*mid < num)
                low = mid + 1;
            else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        isPerfectSquare(808201);
    }
}