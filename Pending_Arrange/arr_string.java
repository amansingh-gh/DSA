import java.util.Scanner;
import java.util.Arrays;
public class arr_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        //  Now interating
        for(int i=0; i<5; i++){
            str[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(str));
    }
}
