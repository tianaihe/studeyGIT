package domain;

import java.io.Serializable;

public class Car implements Serializable{
    private int cid;
    private String number;
    private String brand;
    private int price;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(int cid, String number, String brand, int price) {
        this.cid = cid;
        this.number = number;
        this.brand = brand;
        this.price = price;
    }
    public Car() {

    }

}
