import java.util.Arrays;

public class change_fun {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9};
        make(nums);
        System.out.println(Arrays.toString(nums));
    }    
    static void make(int[] a){
        a[0] = 90;
    }
}
