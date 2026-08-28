package Day_5;

import java.util.ArrayList;
public class IndexExample {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Arun");
        names.add("Bala");
        names.add("Chitra");
        names.add("Dinesh");
        names.add("Eshwar");
        int index = names.indexOf("Chitra");
        System.out.println("Index of Chitra: " + index);
    }
}
