import java.util.Arrays;
public class first_last2{
    
    public static void main(String[] args) {
        int[] arr = {2,5,5,5,5,5,5,5,8,58,98};
        int target = 5;
        int[] ans =searchRange(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = searchIndex(nums, target, true);
        int end = searchIndex(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    

    static int searchIndex(int[] nums , int target, boolean findIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if (target < nums[mid]) {
                end = mid -1;
                
            }else if (target > nums[mid]) {
                start = mid + 1;
            }else{
                ans = mid;
                if (findIndex) {
                    end = mid - 1;
                    
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;

    }

}