import java.util.Scanner;

public class AreaCircumferenceCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter the radius value : ");
        double r = in.nextDouble();
        System.out.println("Area of circle with radius," + r +" : " + area(r) + " and circumference of the circle with radius, " + r +  " is : " + circumference(r));
    }
    static double area( double r ) {
        return Math.PI*r*r;
    }
    static double circumference( double r ) {
        return 2*Math.PI*r;
    }
}
