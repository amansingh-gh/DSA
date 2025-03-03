public class find_mini {
    public static void main(String[] args) {
        int[]arr = {10,544,78,21,-7,32,-1,42};
        System.out.println(min_arr(arr));
    }
    static int min_arr(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
