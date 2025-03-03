import java.util.Scanner;
public class matrix7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[4][3];
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                ar[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                    System.out.print(ar[i][j]+" ");
            }
            System.out.println();
    }
}
}
