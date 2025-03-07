public class find_max {
    public static void main(String[] args) {
        int[] a = {12,45,74,31,69,10};
        System.out.println(maximum(a));
    }
    static int maximum(int[] p){
        int maxint=0;
        for(int i =0; i<p.length; i++){
            if(maxint<p[i]){
                maxint = p[i];
            }
        }
        return maxint;
    }
}