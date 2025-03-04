import java.util.Arrays;
public class swap3 {
    public static void main(String[] args) {
    int[] a= {10,20,30,40,50};
    swaping(a,0,4);       
    System.out.println(Arrays.toString(a));
    }
    static void swaping(int[] a, int index1, int index2 ){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}