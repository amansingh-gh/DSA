public class range {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70,80,90,100};
        int target = 20;
        System.out.println(rangesearch(a,target,1,4));
    }
    static int rangesearch(int[]a, int target, int start, int end){
        if(a.length==0){
            return -1;
        }
            for(int i=start; i<=end; i++){
                int element = a[i];
                if(element==target){
                    return i;
                }
        }
        return -1;
    }
}