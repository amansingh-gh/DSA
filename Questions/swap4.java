import java.util.Arrays;

public class swap4{
    public static void main(String[] args) {
        int[] ar = {10,20,30,40,50};
        swap(ar, 0,1);
        System.out.println(Arrays.toString(ar));
    }
    static void swap(int[] ar, int ind1, int ind2){
        int temp = ar[ind1];
        ar[ind1] = ar[ind2];
        ar[ind2] = temp;
    }
}