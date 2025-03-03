public class ord_agsbs {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,90};
        int target = 5;
        System.out.println(ord_agnosBS(arr,target));
    }
    static int ord_agnosBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            boolean isAsc = arr[start]<arr[end];
            if(target == arr[mid]){
                return mid;
            }
            if (isAsc) {
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

            else{
                if(target>arr[mid]){
                    end = mid+1;
                }
                else{
                    start = mid+1;
                }
            }
            }
            return -1;
        }
    }
