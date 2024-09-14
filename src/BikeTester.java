import java.util.ArrayList;

public class BikeTester {
    public static void main(String[] args) {

        // Create bike1 using the no-argument constructor
        Bike bike1 = new Bike();

        // Print details of bike1
        System.out.println(bike1);

        // Create bike2 using the no-argument constructor
        Bike bike2 = new Bike();

        // Use the setter methods to change bike2's properties
        bike2.setNumberOfWheels(3); // Change number of wheels to 3
        bike2.setManufacturer("Trek"); // Change manufacturer to "Trek"
        bike2.setYear(2020); // Change year to 2020

        // Print details of bike2
        System.out.println(bike2);

        // Create an ArrayList of bikes called bikeList
        ArrayList<Bike> bikeList = new ArrayList<>();

        // Add bike1 and bike2 to bikeList
        bikeList.add(bike1);
        bikeList.add(bike2);

        // Print bikeList which will call toString method
        System.out.println("Bike List: ");
        for (Bike bike : bikeList) {
            System.out.println(bike);
        }

        // Count the total number of wheels on all bikes in the bikeList and print it
        int totalWheels = 0;
        for (Bike bike : bikeList) {
            totalWheels += bike.getNumberOfWheels();
        }
        System.out.println("Total number of wheels on all bikes: " + totalWheels);

        // Find the year of the oldest bike in the list and print it
        int oldestYear = bikeList.get(0).getYear(); // Initialize with the first bike's year
        for (Bike bike : bikeList) {
            if (bike.getYear() < oldestYear) {
                oldestYear = bike.getYear();
            }
        }
        System.out.println("The year of the oldest bike: " + oldestYear);
    }
}
