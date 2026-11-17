public class Main 
{
    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {
        Car car = new Car("Volkswagen", "Type 82 Kübelwagen", 1940, 4);
        Motorcycle motorcycle = new Motorcycle("Zündapp", "KS 750", 1941, "Manual");
        Truck truck = new Truck("Ural", "4320", 1977, 6);
        Printer printer = new Printer();

        Serviceable[] serviceables = { car, motorcycle, truck, printer };

        for (Serviceable item : serviceables) {
            performService(item);
        }

        System.out.println();

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.moveForward();
            vehicle.moveBackwards();
            vehicle.moveLeft();
            vehicle.moveRight();
            System.out.println();
        }
    }
}
