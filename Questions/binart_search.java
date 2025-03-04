public class binart_search {
    public static void main(String[] args) {
        int[] arr = {15,87,63,1236,2364,35641,5522,2355,0,11111};
        int target = 11111;
        System.out.println(binary_srh(arr,target));
    }
    static int binary_srh(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<target){
                mid = end-1;
            }
            else if(arr[mid]>target){
                mid = start+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}