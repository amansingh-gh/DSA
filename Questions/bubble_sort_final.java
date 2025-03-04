public class bubble_sort_final {
    public static void main(String[] args) {
        int[] arr = {41,20,-1,223,122,464,6565,999,9999};
        int target = 999;
        System.out.println(final_bubble(arr,target));
    }
    static int final_bubble(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}