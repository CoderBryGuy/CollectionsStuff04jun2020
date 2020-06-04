package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
//        ArrayList words = new ArrayList();
//        words.add("hello");
//        words.add("there");
//        words.remove(1);
//        words.add(10);
//        words.add(9);
//        words.add(12.00);
//        words.add('H');
//
//        String item1 = (String) words.get(0);
//        int item2 = (int) words.get(1);
//        System.out.println(item1 + item2);


        ArrayList<String> words = new ArrayList();
        words.add("hello");
        words.add("there");
        words.add("10");
//        words.remove(1);
//        words.add(10);
//        words.add(9);
//        words.add(12.00);
//        words.add('H');

        String item1 = words.get(0);
        String item2 = words.get(1);
        System.out.println(item1 +"\n"+ item2);
        int myInt = Integer.parseInt(words.get(2));
        System.out.println(myInt);


        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);

        for (int number: numbers
             ) {
            System.out.println(number);
        }

    }
}
