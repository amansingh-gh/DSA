import java.util.Scanner;
import java.util.ArrayList;
public class arr_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(100267);
        // list.add(7767);
        // list.add(45455467);
        // list.add(477767);
        // list.add(5567);
        // list.add(68);
        // System.out.println(list.contains(7767));  //true
        // System.out.println(list); // print the list
        // list.remove(2); // remove the element form givern index
        // System.out.println(list);  // print updated list
        // System.out.println("The clone list is  "+ list.clone());
        // System.out.println(list);
        // list.set(0, 99);  // changes element form given index
        // System.out.println(list);
        for(int i =0; i<5; i++){
            list.add(sc.nextInt());
        }
        for(int i =0; i<5; i++){
            System.out.println(list.get(i));
        }

    }
}
