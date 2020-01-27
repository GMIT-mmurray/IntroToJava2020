public class Test {

    public static void main(String args[]) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
 /*
        if (a ==1) {
         b = 20;
        } else {
         b = 30;
        }
*/
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;

 /*       if (a == 10) {
            b =20;
        } else {
            b = 30;
        }
  */
        System.out.println( "Value of b is : " + b );
    }
}
