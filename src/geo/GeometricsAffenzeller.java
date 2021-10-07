package geo;

import java.util.Scanner;

public class GeometricsAffenzeller {
    // public double x;
    // public double y;
    // public double z;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib den Wert für x ein: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Gib den Wert für y ein: ");
        double y = Double.parseDouble(scanner.nextLine());
        System.out.println("Gib den Wert für z ein");
        double z = Double.parseDouble(scanner.nextLine());

        System.out.println("Die Fläche des Quadrats beträgt " + squareArea(x));
        System.out.println("Der Umfang des Quadrats beträgt " + squarePerimeter(x));
        System.out.println("Der Flächeninhalt des Rechtecks beträgt " + rectangleArea(x, y));
        System.out.println("Der Umfang des Rechtecks beträgt: " + rectanglePerimeter(x, y));

        System.out.println("We can also calculate some volumes");
        /*
         * z is our height 
         * y is our radius
         */

         System.out.println("Das Volumen einer Kugelschicht beträgt " + zoneofSphere(x, y, z));
         System.out.println("Das Volumen eines Kugelrings beträgt " + spherewithCylinder(z));
         System.out.println("Das Volumen eines Ungula beträgt " + ungula(y, z));

    }

    public static double squareArea(double x) {
        return x * x;
    }

    public static double squarePerimeter(double x) {
        return 4 * x;
    }

    public static double rectangleArea(double x, double y) {
        return x * y;
    }

    public static double rectanglePerimeter(double x, double y) {
        return 2 * (x + y);
    }

    public static double zoneofSphere(double x, double y, double z) {
    return (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
    }

    public static double spherewithCylinder(double z){
    return (Math.PI * Math.pow(z, 3) / 6);
    }

    public static double ungula(double y, double z) {
    return ((2 * Math.pow(y,2)*z) / 3);
    }
}
