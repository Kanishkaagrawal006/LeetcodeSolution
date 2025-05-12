public class Question1822 {
    public static int arraySign(int[] nums) {
        int sign = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                sign = sign * -1;
            }
        }
        return sign;
    }
}
