import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class leetcode448 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 6, 6, 8, 9, 3, 4 };
        cycle_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> cycle_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; i++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
