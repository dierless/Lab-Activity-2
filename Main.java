public class Main 
{
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Car("Volkswagen", "Type 82 Kübelwagen", 1940, 4);
        vehicle.displayInfo();
        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());

        System.out.println();

        vehicle = new Motorcycle("Zündapp", "KS 750", 1941, "Manual");
        vehicle.displayInfo();
        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());

        System.out.println();

        vehicle = new Truck("Sd.Kfz.", "Sonderkraftfahrzeug 234", 1945, 8);
        vehicle.displayInfo();
        System.out.println("Age: " + vehicle.calculateAge());
        System.out.println("Vintage: " + vehicle.isVintage());

        System.out.println();

        Car car = new Car("GAZ", "69", 1953, 2);
        Motorcycle motorcycle = new Motorcycle("Kalashnikov", "Izh-Enduro", 2025, "Automatic");
        Truck truck = new Truck("Ural", "4320", 1977, 6);

        printDetails(car);
        System.out.println();

        printDetails(motorcycle);
        System.out.println();

        printDetails(truck);
        System.out.println();

        Vehicle[] vehicles = {
            new Car("Volkswagen", "Type 82 Kübelwagen", 1940, 4),
            new Motorcycle("Zündapp", "KS 750", 1941, "Manual"),
            new Truck("Sd.Kfz.", "Sonderkraftfahrzeug 234", 1945, 8),
            car, motorcycle, truck
        };

        for (Vehicle currentVehicle : vehicles) {
            currentVehicle.moveForward();
            currentVehicle.moveBackwards();
            currentVehicle.moveLeft();
            currentVehicle.moveRight();
            System.out.println();
        }
    }
}