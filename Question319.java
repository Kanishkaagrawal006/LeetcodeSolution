import java.util.Arrays;

public class Question319 {
    public static void main(String[] args) {
        System.out.println(bulbSwitch(1));
    }
    public static int bulbSwitch(int n) {
        int count =0;
        for(int i=1; i<=n;i++){
            if(isPerfectSquare(i)){
                count++;
            }

        }
        return count;
    }
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int)Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    }