// Define the class
public class Car {
    // Instance variables
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an object of Car
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Display car details
        myCar.displayDetails();

        // Update car details
        myCar.setMake("Honda");
        myCar.setModel("Civic");
        myCar.setYear(2022);

        // Display updated car details
        myCar.displayDetails();
    }
}
