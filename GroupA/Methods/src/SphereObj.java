import java.util.Scanner;

public class SphereObj
{
    public SphereObj() {
        super();
    }

    // obtain radius from user and display volume of sphere
    public static void main(String[] args)
    {
        SphereObj so = new SphereObj();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of sphere: ");
        double radius = input.nextDouble();

        System.out.printf("Volume is %f%n", so.sphereVolume(radius));
    } // end method determineSphereVolume

    // calculate and return sphere volume
    private double sphereVolume(double radius)
    {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    } // end method sphereVolume
} // end clas
