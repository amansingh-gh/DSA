import java.util.Arrays;
import java.util.Scanner;
public class matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        // Input
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        // for(int row = 0; row<3; row++){
        //     for(int col = 0; col<3; col++){
        //         System.out.print(Arrays.toString(arr[row])+ " ");
        //     }
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                System.out.print(Arrays.toString(arr[row])+ " ");
            }
            System.out.println();
        }
    }
}