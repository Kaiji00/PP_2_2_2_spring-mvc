package web.model;

import java.util.ArrayList;

public class Car {

    private String brand;
    private int model;
    private int maxSpeed;

    public Car() {
    }

    public Car(String brand, int model, int speed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = speed;
    }

    public static ArrayList<Car> createFiveCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 1, 300));
        cars.add(new Car("Honda", 20, 234));
        cars.add(new Car("Opel", 12, 411));
        cars.add(new Car("Reno", 2, 200));
        cars.add(new Car("Lada", 30, 150));
        return cars;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + maxSpeed +
                '}';
    }
}
