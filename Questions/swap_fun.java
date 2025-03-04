import java.util.Arrays;
class swap_fun {
    public static void main(String[] args) {
        int [] arr = {10,20,30,80,99};
        System.out.println("The original array is: "+Arrays.toString(arr));
        swap(arr, 0, 4);
        System.out.println("Changed array is: "+Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}