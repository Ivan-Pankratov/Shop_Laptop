package org.example;

public class Laptop extends Shop{

    public int ram;
    public int hardDiskSpace;
    public String operatingSystem;
    public String color;

    public Laptop(long id, String model, double price, int ram,
                  int hardDiskSpace, String operatingSystem, String color) {
        super(id, model, price);
        if (ram < 0 ) this.ram = 1;
        else this.ram = ram;
        if (hardDiskSpace < 0 ) this.hardDiskSpace = 1;
        else this.hardDiskSpace = hardDiskSpace;
        if (operatingSystem == null) this.model = "[OS]";
        else this.operatingSystem = operatingSystem;
        if (color == null) this.color = "[color]";
        else this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id: " + id +
                ", type: '" + type + '\'' +
                ", model: '" + model + '\'' +
                ", RAM: " + ram +"GB" +
                ", HDS: " + hardDiskSpace + "TB" +
                ", OS:'" + operatingSystem + '\'' +
                ", color: '" + color + '\'' +
                ", price: " + price +
                '}';
    }
}
