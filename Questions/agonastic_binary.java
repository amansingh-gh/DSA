public class agonastic_binary {
    public static void main(String[] args) {
        int[]ar = {10,20,30,40,50,60,70,80,90};
        int target = 80;
        System.out.println(agonastic(ar,target));
    }
    static int agonastic(int ar[], int target){
        int start =0;
        int end = ar.length-1;
        boolean isAsc = ar[start] < ar[end];
        int mid = start + (end-start)/2;
        while(target<ar[mid]){
            start = mid-1;
        }

        if (isAsc){
            if(target<ar[mid]){
                end = mid-1;
            }
            else
                if(target>ar[mid]){
                    start = mid+1;
                }
            
        else{
            if(target>ar[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        } 
        return -1;
    }
}
