package PrimeNumberFinder;

import java.util.Scanner;

public class PrimeMain {
        public static boolean IsItPrime (int number) {
            if (number == 1 || number == 2) {
                return true;
            }

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Asal sayıların yazdırılacağı sınır rakamını giriniz");
        int Bound = scanner.nextInt();
        /*

        1'den 1000'e kadar olan sayılardan asal olanları ekrana yazdırın.

        Asal Sayı : 1'e ve kendisinden başka hiçbir sayıya bölünmeyen sayıya asal sayı denir.

        */

        for (int a = 0; a < Bound; a++){
            if (IsItPrime(a)){
                System.out.println(a);
            }
        }

    }
}


