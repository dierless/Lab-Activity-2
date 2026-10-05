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
   }
}

/*
public class Main
{
   public static void main(String[] args)
   {
      Vehicle v1 = new Vehicle();
      v1.brand = ("Nissan");
      v1.model = ("Skyline GT-R V-Spec II");
      v1.year = 1994;
   
      System.out.println("First Vehicle");   
      v1.displayInfo();
      System.out.println("Age: " + v1.calculateAge());
      System.out.println("Vintage: " + v1.isVintage());
      System.out.println();
   
      Vehicle v2 = new Vehicle();
      v2.brand = ("Subaru");
      v2.model = ("Impreza WRX STi Coupe Type R Version V");
      v2.year = 1998;
      
      System.out.println("Second Vehicle");
      v2.displayInfo();
      System.out.println("Age: " + v2.calculateAge());
      System.out.println("Vintage: " + v2.isVintage());
      System.out.println();
      
      Vehicle v3 = new Vehicle();
      v3.brand = ("Mazda");
      v3.model = ("Efini RX-7 Type R");
      v3.year = 1991;
      
      System.out.println("Third Vehicle");
      v3.displayInfo();
      System.out.println("Age: " + v3.calculateAge());
      System.out.println("Vintage: " + v3.isVintage());
      System.out.println();
   }
}
*/