package com.bryan.lesson2;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        LinkedList<Vehicle> vehicles = new LinkedList<>();
        Vehicle vehicle2 = new Vehicle("Toyota","Camery", 12000, false);
        vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

//        Iterator<Vehicle> iter = vehicles.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }

        ArrayList<String> animals = new ArrayList<>();
        animals.add("lion");
        animals.add("dog");
        animals.add("cat");
        animals.add("birds");


        printElements(vehicles);
        printElements(animals);
//
//        System.out.println("Iterator");
//
//        Iterator<String> iter = animals.iterator();
//        while(iter.hasNext()){
//            String animal = iter.next();
//            System.out.println(animal);
//        }
//
//        System.out.println("********************");
//        System.out.println("foreach");
//
//        for (String animal:animals
//             ) {
//            System.out.println(animal);
//        }
//
//        System.out.println("********************");
//        System.out.println("for");
//
//        for (int i = 0; i < animals.size(); i++) {
//            System.out.println(animals.get(i));
//        }
//
//        System.out.println("********************");
//        System.out.println("while");
//        int y = 0;
//        while(y < animals.size()){
//            System.out.println(animals.get(y++));
//        }
//
//        System.out.println("********************");
//        System.out.println("do while");
//
//        do{
//            System.out.println(animals.remove(0));
//        }while (!animals.isEmpty());
    }

    static  public void printElements(List<?> elements ){
        Iterator<?> iter = elements.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        
    }
}
