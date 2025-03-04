import java.util.Scanner;
import java.util.Arrays;
public class swap_arr2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,100};
        swap(arr, 0,5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
