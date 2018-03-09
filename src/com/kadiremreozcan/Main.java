package com.kadiremreozcan;


public class Main {
    public static void main(String[] args) {
        String sampleString = "photo.jpg, Warsaw, 2013-09-05 14:08:15";
        String[] animals = sampleString.split("\\s*,\\s*");
        String[] extention = animals[0].split("\\.");

//        String joined2 = String.join(",", animals);
//        System.out.println(joined2);


        for (String animal : animals) {
            System.out.println(animal);
        }


    }
}