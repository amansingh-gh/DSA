public class max_arr {
    public static void main(String[] args) {
        int[] a = {12,13,44,22,998,10};
        System.out.println(max(a));
    }
    static int max(int[] a){
        int maxInt = 0;
        for(int i=0; i<a.length; i++){
            if (maxInt<a[i]) {
                maxInt = a[i];
            }
        }
        return maxInt;
    }

}
