package geo;
import java.util.Scanner;

public class GeometricsAffenzeller {
  public double x;
  public double y;
  public double z;


    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib den Wert für x ein: ");
        x = Double.parseDouble(scanner.nextLine());
        System.out.println("Gib den Wert für y ein: ");
        y = Double.parseDouble(scanner.nextLine());
        System.out.println("Gib den Wert für z ein");
        z = Double.parseDouble(scanner.nextLine());

        
        

    }

   public static double squareArea(double a) {
       double a=x*x;
       return a;
   }

   public static double squarePerimeter(double x) {
       System.out.println("Die Umfang des Quadrats beträgt" + 4*x);
   }


   public static double rectangleArea(double x, double y) {
       System.out.println("Der Flächeninhalt des Rechtecks beträgt " + x*y);
   }

   public static double rectanglePerimeter(double x, double y) {
       System.out.println("Der Umfang des Rechtecks beträgt: " + 2*(x+y));
   }
   
   public static double zoneofSphere(double x, double z, double y) {
    double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    System.out.println(v);
   }

   public static double spherewithCylinder(double z){
    System.out.println(Math.PI * Math.pow(z, 3) / 6);
   }

   public static double ungula(double x, double z) {
    System.out.println((2 * Math.pow(y,2)*z) / 3); 
   }
}
