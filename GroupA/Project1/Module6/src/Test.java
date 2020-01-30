public class Test {

    public static void main(String args[]) {
        int a = 6;
        int b = 7;
        char h = 'C';

        Integer x = new Integer(a); // boxes int to an Integer object
        Integer y = new Integer(b);
        float f = x.floatValue();

        Integer z = Integer.decode("343324");


        int c = z.intValue();
        long e = x.longValue();

        int d = Integer.parseInt("1234");
        Integer q = Integer.valueOf(b);

        System.out.println(Character.isUpperCase(h));

        x =  x + 10;   // unboxes the Integer to a int


        System.out.println(x);
    }
}