import java.util.Arrays;

public class ss {
    public static void main(String[] args) {
        int[] arr = {10,8,46,20};
        ss(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void ss(int[]arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int getmaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int [] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
