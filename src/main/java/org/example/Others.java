package org.example;
import java.util.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Others {

    // Создание сета
    public static void initSetLaptop(Set<Laptop> laptopSet) {
        Laptop laptop1 = new Laptop(123, "Aser-15", 12000, 8, 1, "Linux", "blue");
        Laptop laptop2 = new Laptop(125, "HP-15", 15000, 4, 1, "Windows", "black");
        Laptop laptop3 = new Laptop(127, "Asus-NW", 17000, 16, 1, "Windows", "gold");
        Laptop laptop4 = new Laptop(132, "Aser-5", 7000, 4, 1, "Windows", "silver");
        Laptop laptop5 = new Laptop(136, "Aser-11", 12000, 8, 1, "Windows", "white");
        Laptop laptop6 = new Laptop(129, "Samsung-15", 12000, 8, 1, "Linux", "blue");
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
    }

    // Метод поиска
    public static void initQuestion(HashSet<Laptop> laptops) {
        System.out.println("Введите цифру, соответствующую необходимому критерию: \n" +
                "1 - id \n" +
                "2 - model \n" +
                "3 - RAM (ОЗУ) \n" +
                "4 - HDS (Объем ЖД) \n" +
                "5 - OS (Операционная система) \n" +
                "6 - Color (Цвет) \n" +
                "7 - price (Цена)");
        Scanner in = new Scanner(System.in);
        System.out.print("Итак, ваше число: ");
        String num = in.nextLine();
        try {
            int n = parseInt(num);
            find(laptops, n);
        } catch (NumberFormatException ex) {

            System.out.println("Ошибка. \n" +
                    "Похоже введено не то, что ожидалось.");
        } finally{
            System.out.println("Спасибо, что воспользовались поиском.");
        }
    }


    private static void find(HashSet<Laptop> laptops, int n){
        Scanner in = new Scanner(System.in);
        switch(n){
            case 1:
                System.out.print("Введите искомый номер id ");

                String ids = in.nextLine();
                long i = parseLong (ids);
                boolean ok1 = false;
                for (Laptop elem: laptops){
                    if (elem.id==i) {
                        System.out.println(elem);
                        ok1 = true;
                    }
                }
                if (!ok1) System.out.println("Нет устройства по Вашему запросу.");
                break;
            case 2:
                System.out.print("Введите название модели или хотя бы первые символы ");
                String num2 = in.nextLine();
                boolean ok2 = false;
                for (Laptop elem: laptops){
                    if (elem.model.startsWith(num2)) {
                        System.out.println(elem);
                        ok2 = true;
                    }
                }
                if (!ok2) System.out.println("Нет устройства по Вашему запросу.");
                break;
            case 3:
                System.out.println("Введите минимальное значение RAM ");
                String num3 = in.nextLine();
                int r = parseInt (num3);
                boolean ok3 = false;
                for (Laptop elem: laptops){
                    if (elem.ram >= r) {
                        System.out.println(elem);
                        ok3 = true;
                    }
                }
                if (!ok3) System.out.println("Нет устройства по Вашему запросу.");
                break;
            case 4:
                System.out.println("Введите минимальное значение HDS ");
                String num4 = in.nextLine();
                int hds = parseInt (num4);
                boolean ok4 = false;
                for (Laptop elem: laptops){
                    if (elem.hardDiskSpace >=hds) {
                        System.out.println(elem);
                        ok4 = true;
                    }
                }
                if (!ok4) System.out.println("Нет устройства по Вашему запросу.");
                break;
            case 5:
                System.out.println("Введите название OS ");
                String num5 = in.nextLine();
                boolean ok5 = false;
                for (Laptop elem: laptops){
                    if (elem.operatingSystem.startsWith(num5)) {
                        System.out.println(elem);
                        ok5 = true;
                    }
                }
                if (!ok5) System.out.println("Нет устройства по Вашему запросу. " +
                        "Проверьте, подалуйста, написание больших и малых символов в названии ");
                break;
            case 6:
                System.out.print("Введите искомый цвет ");
                String num6 = in.nextLine();
                boolean ok6 = false;
                for (Laptop elem: laptops){
                    if (elem.color.startsWith(num6)) {
                        System.out.println(elem);
                        ok6 = true;
                    }
                }
                if (!ok6) System.out.println("Нет устройства по Вашему запросу.");
                break;
            case 7:
                System.out.print("Введите максимальное значение price ");
                String num7 = in.nextLine();
                double prc = parseDouble (num7);
                boolean ok7 = false;
                for (Laptop elem: laptops){
                    if (elem.price <=prc) {
                        System.out.println(elem);
                        ok7 = true;
                    }
                }
                if (!ok7) System.out.println("Нет устройства по Вашему запросу.");
                break;

            default:
                System.out.println("Нет устройства по Вашему запросу.");
        }
    }

}
