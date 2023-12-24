package org.example;

public class Shop {
    protected String type;

    protected long id;
    protected String model;
    protected double price;

    public Shop(long id, String model, double price) {

        this.type = getClass().getSimpleName();
        if (id < 0 ) this.id = 100;
        else this.id = id;
        if (model == null || model.length()<3) this.model = "[model]";
        else this.model = model;
        if (price <1000) this.price = 1000;
        else   this.price = price;
    }

    @Override
    public String toString() {
        return type + "{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
