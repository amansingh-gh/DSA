import java.util.Arrays;
public class selection_sort {
    public static void main(String[] args) {
        int[]arr = {10,20,4,12,65,100,23};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getmaxIndex(arr,0,last);
            swap(arr, maxIndex, last);

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
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
