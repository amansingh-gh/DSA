import java.util.Arrays;
public class arr_fun3 {
    public static void main(String[] args) {
        int[] add = {12,45,77,88,99};
        System.out.println(Arrays.toString(add));
        change(add);
        System.out.println(Arrays.toString(add));
    }
    static void change(int[] addsss){
        addsss[0] = 400000;
    }
}