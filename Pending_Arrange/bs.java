public class bs {
    public static void main(String[] args) {
        int[] arr = {10,50,4,30,8,90};
        int target = 8;
        System.out.println(bsearch(arr,target));
    }
    static int bsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}