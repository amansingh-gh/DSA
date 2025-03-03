public class range2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,4,25,87,98};
        int target = 4;
        System.out.println(rangeSearch(arr,target,2,6));
    }
    static int rangeSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
