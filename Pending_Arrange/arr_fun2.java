import java.util.Arrays;
public class arr_fun2 {
    public static void main(String[] args) {
    int[] arrs = {12,13,55,77};
    System.out.println(Arrays.toString(arrs));
    change(arrs);
    System.out.println(Arrays.toString(arrs));
}
static void change(int[] arrs){
    arrs[2] = 5000;
}
}
