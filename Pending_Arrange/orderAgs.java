public class orderAgs {
    public static void main(String[] args) {
        int[]arr = {-89,-24, -23, -8, -5, -2, -1, 12 ,15 ,17 ,20 ,79 ,89 ,99 ,1001};
        int target = 99;
        System.out.println(orderanostic(arr,target));
    }
    static int orderanostic(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start + (end-start)/2;

            if(isAsc) {
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
