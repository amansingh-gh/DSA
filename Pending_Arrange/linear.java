public class linear {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int target = 50;
        int ans = linear_search(arr, target);
        System.out.println(ans);

    }

    static int linear_search(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }
        for(int index = 0; index<nums.length; index++){
            // int element = nums[index];
            if(nums[index]==target){
                return index;
            }
        }
        return -1;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60};
        int target = 30;
        int ans = linear(nums,target);
        System.out.print(ans);
    }
    static int linear(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}