public class Check{
    static void changeValue(int x){
        x+=10;
        System.out.println("Inside method: "+x);

    }
    public static void main(String[] args) {
        int x = 90;
        // Check c = new Check();
        // c.changeValue(x);   
        changeValue(x);
        System.out.println("After changes: "+x);

    }
}