package LinkedLİst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedlist  = new LinkedList<Integer>();
        ArrayList<Integer> arraylist =  new ArrayList<Integer>();

        zamanhesapla("LinkedList",linkedlist);
        zamanhesapla("ArrayList",arraylist);


    }
    public static void zamanhesapla(String veri_tipi,List<Integer> list) {

        // Listin sonuna değer ekleme
        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();

        for (int i = 0 ; i< 100000 ; i++) {

            //list.add(i); // listenin sonuna eklendiğinde Arraylist daha hızlı
            list.add(0,i); // ama listede kaydırma gerektiren herhangi bir yere eklendiğinde linked list daha hızlı

        }
        bitis = System.currentTimeMillis();

        System.out.println(veri_tipi + " ekleme süresi " + (bitis - baslangic) + " ms");




    }
}
