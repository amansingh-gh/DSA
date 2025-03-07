import java.util.Arrays;
public class swap2{
    public static void main(String[] args) {
        int[] pi = {10,54,87,33,11};
        swap(pi, 0,1);
        System.out.println(Arrays.toString(pi));
    }
    static void swap(int[] pi, int pio1,int pio2){
        int temp = pi[pio1];
        pi[pio1] = pi[pio2];
        pi[pio2] = temp;
    }
}