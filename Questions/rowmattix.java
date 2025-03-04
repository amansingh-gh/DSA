import java.util.Arrays;
public class rowmattix{
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30},
            {40,50,60},
            {80,90,110}
        };
        int target = 90;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][]arr,int target){
        int row  = 0;
        int col = arr.length-1;
        while(row < arr.length && col >=0){
            if(arr[row][col]==target){
                return new int[] {row, col};
            }
            if(arr[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}