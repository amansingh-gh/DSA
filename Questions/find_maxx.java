public class find_maxx{
    public static void main(String[] args) {
        int[] arr = {12,748,54,668,12,10};
        System.out.println(max_val(arr));
    }
    static int max_val(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int ans = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}