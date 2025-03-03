public class linear_srh {
        public static void main(String[] args) {
            // int[]nums = {10,20,30,40,52,87,100};
            int[]nums = {0,87};
            int target = 87;
            int ans = linearsearch(nums, target);
            System.out.println(ans);
        }
        static int linearsearch(int[] nums, int target){
            if(nums.length==0){
                return -1;
            }
            for(int index=0; index<nums.length; index++){
                int element = nums[index];
                if(element == target){
                    return index;
                }
            }
            return -1;

        }
}