package ArrayList;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {

        ArrayList<String> arraylist = new ArrayList<String>();

        // Eleman ekleme
        arraylist.add("python");
        arraylist.add("java");
        arraylist.add("c++");

        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(2));
    }
}
