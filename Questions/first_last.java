class first_last{
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 7;
        System.out.println((searchRange(nums, target)));
    }
    static int[] searchRange(int[] nums, int target) {
                int[] ans = {-1, -1};
                int start = 0;
                int end = nums.length-1;
        
                while(start<=end){
                    int mid = start +(end-start)/2;
                    if(target == nums[mid]){
                        ans[0] = mid;
                        end = mid-1;
                    }
                    else if(nums[mid]<target){
                        start=mid+1;
                    }
                    else{
                        start = mid-1;
                    }
                }
                 start = 0;
                 end = nums.length-1;
                 while(start<=end){
                    int mid = start + (end-start)/2;
                    if(target == nums[mid]){
                        ans[1] = mid;
                        start = mid+1;
                    }
                    else if(nums[mid]<target){
                        start = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                    
                }
                return ans;
            }
        }