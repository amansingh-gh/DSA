public class linear_srh2 {
    public static void main(String[] args) {
        int ar[] = {10,20,30,40,50};
        int target = 40;
        boolean res = linearsearch(ar,target);
        System.out.println(res);
    }
    // static int linearsearch(int[] ar, int target){
    //     if(ar.length==0){
    //         return -1;
    //     }
    //     for(int index=0; index<ar.length;index++){
    //         int element = ar[index];
    //         if(element==target){
    //             return index;
    //         }
    //     }
    //     return -1;
    // }
    static boolean linearsearch(int[] ar, int target){
        if(ar.length==0){
            return false;
        }
        for(int index=0; index<ar.length;index++){
            int element = ar[index];
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
