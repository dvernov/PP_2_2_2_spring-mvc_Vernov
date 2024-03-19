package web.model;

import org.springframework.context.annotation.Bean;

public class Car {

    private String model;
    private int number;
    private boolean onSale;

    public Car() {
    }
    public Car(String model, int number, boolean onSale) {
        this.model = model;
        this.number = number;
        this.onSale = onSale;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }
}
