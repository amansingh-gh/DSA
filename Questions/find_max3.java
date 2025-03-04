public class find_max3 {
    public static void main(String[] args) {
        int arr[] = {10,54,88,77,603,100};
        System.out.println(max_val(arr));
    }
    static int max_val(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
