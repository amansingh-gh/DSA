public class binary_srh {
        public static void main(String[] args) {
            int[] arr ={1,2,10,11,15,17,19,20,55,88,100,1001};
            int target = 550;
            System.out.println(binarysearch(arr, target));
        }
        static int binarysearch(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end - start)/2;

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