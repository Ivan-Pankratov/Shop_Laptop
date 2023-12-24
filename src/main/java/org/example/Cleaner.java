package org.example;

public class Cleaner extends Shop{

    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Cleaner(long id, String model, double price, int power) {
        super(id, model, price);
        this.power = power;
    }

}
