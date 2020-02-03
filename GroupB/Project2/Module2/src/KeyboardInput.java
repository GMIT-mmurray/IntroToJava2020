import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        System.out.print( " Enter Username :");
        String s = sc.nextLine();
        System.out.println("My Username is " + s);

        System.out.print( " Enter a number :");
        int i = sc.nextInt();
        System.out.println("My Number is " + i);

        System.out.print( " Enter a number :");
        int i1 = sc.nextInt();
        System.out.println("My Number is " + i1);

        System.out.print( " Enter two number to be added  :");
        int i = sc.nextInt();
        int i1 = sc.nextInt();
        int sum = i + i1;
        System.out.println("The Sum Is :" + sum);
*/
        System.out.print( " Enter two floating point numbers to be added  :");
        float f = sc.nextFloat();
        float f1 = sc.nextFloat();
        float sum = f + f1;
        System.out.println("The Sum Is :" + sum);

    }
}
