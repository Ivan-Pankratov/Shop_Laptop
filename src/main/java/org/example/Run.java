package org.example;
import java.util.*;

import static org.example.Others.*;


public class Run {

    public static void run(){
        HashSet<Laptop> laptopSet = new HashSet<>();
        initSetLaptop(laptopSet);
        printSet(laptopSet);
        initQuestion(laptopSet);
    }


    // Метод вывода на печать объекта Set
    private static void printSet(Set<Laptop> laptopSet) {
        for (Laptop elem: laptopSet){
            System.out.println(elem);
        }
    }

}
