package ArrayList;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {

        ArrayList<String> arraylist = new ArrayList<String>();

        // Eleman ekleme
        arraylist.add("python");
        arraylist.add("java");
        arraylist.add("c++");

        // Eleman Erişme
        //System.out.println(arraylist.get(0));
        //System.out.println(arraylist.get(2));
        //System.out.println(arraylist.get(4)); //hata verir

        System.out.println("************* Normal For Döngüsü **************");

        for (int i = 0; i<arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }

        // Eleman Silme
        arraylist.remove(0);

        System.out.println("************ For Each Döngüsü ***************");

        for ( String s: arraylist ) {
            System.out.println(s);
        }


    }
}
