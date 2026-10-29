public class Motorcycle extends Vehicle 
{
    private String engineType;

    public Motorcycle(String brand, String model, int year, String engineType) {
        super(brand, model, year);
        this.engineType = engineType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type: " + engineType);
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