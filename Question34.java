public class Question34 {
     public int[] searchRange(int[] nums, int target) {
    int[]ans = {-1,-1};
int start = binarySearch(nums, target, true);
int end = binarySearch(nums, target, false);
ans[1]= end;
ans[0]=start;
return ans;


    }
    public int binarySearch(int [] nums, int target, boolean findsearch){
    int ans = -1;
        int start =0;
        int end = nums.length -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>nums[mid]){
                start = mid+1;

            }
            else if(target<nums[mid]){
                end = mid -1;
            }
            else{
                ans = mid ;
                if(findsearch){
                     end = mid-1 ;
                }
                    else{

         start= mid+1;
                    }
                
            }

        }
        return ans  ;
    }
}
