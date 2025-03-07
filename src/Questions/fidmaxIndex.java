// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class fidmaxIndex {
    public static void main(String[] args) {
     int[] arr = {10,20,100,30,40,50};
    //  int last = arr.length;
     System.out.println(findmax(arr));
    }
    static int findmax(int[] arr){
        int max = 0;
        for(int i=0; i<=arr.length; i++){
         if(arr[max]<arr[i]){
             max = i;
        }
    }
        return max;
}
}