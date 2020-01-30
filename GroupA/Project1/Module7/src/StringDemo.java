public class StringDemo {

    public static void main(String args[]) {
        String string1 = "saw I was ";
        System.out.println("Dot " + string1 + "Tod");
        String string2 = "Dot " + string1 + "Tod";
        String string3 = new StringBuffer(string2).reverse().toString();
        if (string2.compareToIgnoreCase(string3) == 0){
            System.out.println("Its a Palidrome");
        } else {
            System.out.println("Its NOT a Palidrome");
        }
    }
}
