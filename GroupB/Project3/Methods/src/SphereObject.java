import java.util.Scanner;

public class SphereObject
{
    private int j = 6;
    // obtain radius from user and display volume of sphere
    public static void main(String[] args)
    {
        int i = 8;

        SphereObject so = new SphereObject();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of sphere: ");
        double radius = input.nextDouble();

        System.out.printf("Volume is %f%n", so.sphereVolume(radius));
        so.j = 7;
        i = 7;

    } // end method determineSphereVolume

    // calculate and return sphere volume
    private double sphereVolume(double radius)
    {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    } // end method sphereVolume
} // end class Sphere
