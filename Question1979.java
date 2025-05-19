public class Question1979 {
   public   int findGCD(int[] nums) {
        int max = getmin(nums);
        int min = getmax(nums);
        return gcd(max,min);
    }

    private  int getmin(int[] nums) {
        int min= nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }

    private  int getmax(int [] nums) {
        int max= nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    public int gcd(int a, int b) {
        while(b!=0){
            int temp = b;
            b=a%b;
            a  = temp;
        }
        return a;
    }
}
