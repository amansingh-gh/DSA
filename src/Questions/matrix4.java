import java.util.Scanner;
public class matrix4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [3][4];

        System.out.println("Enter the values: ");
        //Now taking input
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }    
}
