public class Truck extends Vehicle 
{
    private int numberOfWheels;

    public Truck(String brand, String model, int year, int numberOfWheels) {
        super(brand, model, year);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    @Override
    public void moveForward() {
        System.out.println(brand + " " + model + " moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println(brand + " " + model + " moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println(brand + " " + model + " moves left");
    }

    @Override
    public void moveRight() {
        System.out.println(brand + " " + model + " moves right");
    }
}