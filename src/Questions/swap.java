import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
        int[] ar = {10,20,30,40,50,60};
        swap(ar, 0,4);
        System.out.println(Arrays.toString(ar));
    }
    static void swap(int[] ar, int pos1, int pos2){
        int temp = ar[pos1];
        ar[pos1] = ar[pos2];
        ar[pos2] = temp;
    }
}
