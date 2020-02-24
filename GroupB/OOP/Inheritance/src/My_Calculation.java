public class My_Calculation extends Calculation {

    public My_Calculation() {
        super();
        System.out.println("Sub class constructor");
    }

    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }

    @Override
    protected void addition(int x, int y) {
        super.addition(x,y);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}