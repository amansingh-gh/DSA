import java.util.Arrays;

public class search_2d_arr {
    public static void main(String[] args) {
        int[][] arr= {
                {1,110,21,54},
                {1,122,155,84,41},
                {1011,25,75,694,10}
        };
        int target = 11110;
        int[] res = search_2d(arr,target);
        System.out.println(Arrays.toString(res));
    }
    static int[] search_2d(int[][] arr, int target){
        // if(arr.length==0){
        //     return -1;
        // }
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
