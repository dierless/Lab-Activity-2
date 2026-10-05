public class Main
{
   public static void main(String[] args)
   {
      Vehicle v1 = new Vehicle("Nissan", "Skyline GT-R V-Spec II", 1994);
      
      System.out.println("First Vehicle");
      v1.displayInfo();
      System.out.println("Age: " + v1.calculateAge());
      System.out.println("Vintage: " + v1.isVintage());
      System.out.println();

      Vehicle v2 = new Vehicle("Subaru", "Impreza WRX STi Coupe Type R Version V", 1998);
      
      System.out.println("Second Vehicle");
      v2.displayInfo();
      System.out.println("Age: " + v2.calculateAge());
      System.out.println("Vintage: " + v2.isVintage());
      System.out.println();

      Vehicle v3 = new Vehicle("Mazda", "Efini RX-7 Type R", 1991);
      
      System.out.println("Third Vehicle");
      v3.displayInfo();
      System.out.println("Age: " + v3.calculateAge());
      System.out.println("Vintage: " + v3.isVintage());
      System.out.println();

      System.out.println("Getters");
      System.out.println("Brand: " + v1.getBrand());
      System.out.println("Model: " + v1.getModel());
      System.out.println("Year: " + v1.getYear());
      System.out.println();

      System.out.println("setYear Tests");

      System.out.println("setYear(2000): " + v1.setYear(2000));
      System.out.println("Year is " + v1.getYear());
      System.out.println("Age: " + v1.calculateAge());
      System.out.println("Vintage: " + v1.isVintage());
      System.out.println();

      System.out.println("setYear(1885): " + v1.setYear(1885));
      System.out.println("Year remains " + v1.getYear());
      System.out.println();

      System.out.println("setYear(2027): " + v1.setYear(2027));
      System.out.println("Year remains " + v1.getYear());
      System.out.println();

      Vehicle invalid1 = new Vehicle("Test", "Invalid 1885", 1885);
      System.out.println("New vehicle with year 1885");
      System.out.println("Initial year is " + invalid1.getYear());
      System.out.println();

      Vehicle invalid2 = new Vehicle("Test", "Invalid 2027", 2027);
      System.out.println("New vehicle with year 2027");
      System.out.println("Initial year is " + invalid2.getYear());
   }
}