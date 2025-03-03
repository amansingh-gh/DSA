public class max_arr2 {
    public static void main(String[] args) {
        int []a= {10,55,879,512,10};
        System.out.println(max(a));
    }
    static int max(int[] a){
        int maxVal = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i]>maxVal){
                maxVal = a[i];
            }
        }
        return maxVal;
    }
}
