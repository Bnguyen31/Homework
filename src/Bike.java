import java.util.ArrayList;

public class Bike {
    // Instance variables
    private int numberOfWheels;
    private String manufacturer;
    private int year;

    // First no-argument constructor
    public Bike() {
        this.numberOfWheels = 2;
        this.manufacturer = "Schwinn";
        this.year = 2014;
    }

    // Constructor
    public Bike(int numberOfWheels, String manufacturer, int year) {
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    // Getters and Setters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString
    public String toString() {
        return "Bike Details: [Number of Wheels: " + numberOfWheels + ", Manufacturer: " + manufacturer + ", Year: " + year + "]";
    }
}
