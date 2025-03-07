public class linear_string_srh {
    public static void main(String[] args) {
        String name = "Aman";
        char target = 'p';
        System.out.println(SearchString(name,target));
    }
    static boolean SearchString(String name, char target){
        if(name.length()==0){
            return false;
        }
        for(int i=0; i<name.length(); i++){
            if(target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
