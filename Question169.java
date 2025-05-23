public class Question169 {
    public int majorityElement(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
        int majority = nums.length/2;
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) >majority){
                return num;
            }
        }
        return -1;
    }
}
