public class Test {

    public static void main(String args[]) {
        Integer x = 5; // boxes int to an Integer object
        String s = "123456";

        x =  x + 10;   // unboxes the Integer to a int
        System.out.println(x);

        int a = Integer.decode(s);
        System.out.println(a);

        System.out.println(Integer.max(2,6545));
        System.out.println(Integer.max(Integer.decode(s),6545));
        System.out.println(Integer.toBinaryString(0x54345345));
    }
}