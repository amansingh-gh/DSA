public class elemetininfinite_arr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110,112,220,330,500};
        int target = 112;
        System.out.println(infinitesearch(arr,target));
    }
    static int infinitesearch(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>=arr[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start = newStart;
        }
        return binarysearch(arr, target, start, end);
    }
    static int binarysearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
            end = mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
     }
     return -1;
  }
}
