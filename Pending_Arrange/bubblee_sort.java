import java.util.Arrays;
public class bubblee_sort {
    public static void main(String[] args) {
        int[] arr = {10,-1,20,-3,4,7,89,100};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble_sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}