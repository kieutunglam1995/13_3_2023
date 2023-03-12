package bai_2;

public class Car {
    private String make;
    private String model;
    private static int numberOfCars = 0;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        numberOfCars++;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }
}


