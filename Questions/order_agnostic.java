public class order_agnostic {
    public static void main(String[] args) {
        int[]arr = {100,-20,-10,20,50,80};
        int target = 100;
        int ans = order_ans(arr,target);
        System.out.println(ans);
    }
    static int order_ans(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start= mid+1;
                }
            }
        
        }
        return -1;
    }
}
