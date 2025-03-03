public class binarysrh {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        System.out.println(binary_srh(arr, target));
    }
    static int binary_srh(int[] arr, int target){
        int start = 0; 
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
            end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        // return arr[start];
        return arr[end];
        // return start=end+1;
        // return end+1; 
    }
}