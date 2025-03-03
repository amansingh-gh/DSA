public class linear_srh4 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 40;
        System.out.println(linear_srh(arr,target));
    }
    static int linear_srh(int[] arr, int target){
        if(arr.length==0){
        return -1;
        }
        for(int index=0; index<arr.length; index++){
           if(arr[index]==target){
                return index;
           }
        }
        return -1;
    }
}
