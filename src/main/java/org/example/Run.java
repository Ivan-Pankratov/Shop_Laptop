package org.example;
import java.util.*;
import static org.example.Others.initSetLaptop;

public class Run {
    public static void run(){
        Set<Laptop> laptopSet = new HashSet<>();
        initSetLaptop(laptopSet);
        //printSet(laptopSet);

        initQuestion();
    }

    //Метод запроса критериев
    public static HashMap<Integer, List<String>> initQuestion(){
        HashMap<Integer, List<String>> quest = new HashMap<>();
        System.out.println("Введите цифру, соответствующую необходимому критерию: \n" +
                "1 - id \n" +
                "2 - RAM (ОЗУ) \n" +
                "3 - HDS (Объем ЖД) \n" +
                "4 - OS (Операционная система) \n" +
                "5 - Color (Цвет) \n" +
                "6 - price (Цена)");
        Scanner in = new Scanner(System.in);
        System.out.print("Итак, ваше число: ");
        String num = in.nextLine();
        System.out.println(num);

        return quest;

    }
}
