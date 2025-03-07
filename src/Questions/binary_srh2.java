public class binary_srh2 {
    public static void main(String[] args) {
        int[] ar = {1,2,5,10,12,15,47,88,90,100,105};
        int target = 105;
        System.out.println(binarysrh(ar, target));
    }
    static int binarysrh(int[] ar, int target){
        int start = 0;
        int end = ar.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<ar[mid]){
                end = mid-1;
            }
            else if(target>ar[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
