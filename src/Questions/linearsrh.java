public class linearsrh {
    public static void main(String[] args) {
        int[]arr={10,12,47,64,102,89};
        int target = 47;
        System.out.println(linearsrh(arr,target));
    }
    static int linearsrh(int [] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
