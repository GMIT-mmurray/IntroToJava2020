public class MyCalculation extends Calculation {

    private int z;

    public MyCalculation() {
        super();
        System.out.println(" MyCalculation Constructor");
    }

    public void multiplication(int x, int y) {
        //z = x * y;
        setZ(x*y);
        System.out.println("The product of the given numbers:"+getZ());
    }
    @Override
    public void addition(int x, int y) {
        //z = x + y;
        // setZ(x+y);
        //System.out.println("The sum of the given numbers:"+getZ());
        super.addition(x,y);
        super.z = x+y;
    }
    public static void main(String args[]) {
        int a = 20, b = 10;
        MyCalculation demo = new MyCalculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}
