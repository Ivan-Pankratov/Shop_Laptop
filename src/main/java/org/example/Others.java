package org.example;

import java.util.Set;

public class Others {

    // Создание сета
    public static Set<Laptop> initSetLaptop(Set<Laptop> laptops) {

        Laptop laptop1 = new Laptop(123, "Aser-15", 12000, 8, 1, "Linux", "blue");
        Laptop laptop2 = new Laptop(125, "HP-15", 15000, 4, 1, "Windows", "black");
        Laptop laptop3 = new Laptop(127, "Asus-NW", 17000, 16, 1, "Windows", "gold");
        Laptop laptop4 = new Laptop(132, "Aser-5", 7000, 4, 1, "Windows", "silver");
        Laptop laptop5 = new Laptop(136, "Aser-11", 12000, 8, 1, "Windows", "white");
        Laptop laptop6 = new Laptop(129, "Samsung-15", 12000, 8, 1, "Linux", "blue");
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        return laptops;
    }

    // Метод вывода на печать объекта Set
    public static void printSet(Set<Laptop> laptops){
        for (Object elem: laptops){
            System.out.println(elem);
        }
    }
}
