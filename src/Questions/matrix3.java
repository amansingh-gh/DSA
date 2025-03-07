import java.util.Scanner;
public class matrix3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [][] = new int[4][3];
        System.out.println("Enter the values: ");
        //for input
        for(int row = 0; row<4; row++){
            for(int col = 0; col<3; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //Output
        for(int row = 0; row<4; row++){
            for(int col = 0; col<3; col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

    }
}
