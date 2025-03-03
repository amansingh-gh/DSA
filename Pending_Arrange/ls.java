public class ls{
    public static void main(String[] args) {
        int[] arr = {10,50,4,30,8,90};
        int target = 8;
        System.out.println(linearsearch(arr,target));
    }
    static int linearsearch(int[]arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}