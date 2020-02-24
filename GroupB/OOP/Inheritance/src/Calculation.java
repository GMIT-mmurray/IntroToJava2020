class Calculation extends Object{
    protected int z;

    public Calculation() {
        System.out.println("Super class constructor");
    }

    protected void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    protected void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}