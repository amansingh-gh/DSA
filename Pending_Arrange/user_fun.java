import java.util.Scanner;
import java.util.Arrays;
public class user_fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
