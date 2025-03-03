import java.util.Arrays;
public class linearstring_srh {
    public static void main(String[] args) {
        String name = "Singh";
        char target = 'i';
        // System.out.println(string_search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
//     static boolean string_search(String name, char target){
//         if(name.length()==0){
//             return false;
//         }
//         for(int i=0; i<name.length(); i++){
//             if(target==name.charAt(i)){
//                 return true;
//             }
//         }
//         return false;
//     }
}