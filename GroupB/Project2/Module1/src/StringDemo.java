public class StringDemo {

    public static void main(String args[]) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println( "String Length is : " + len );
        //palindrome = palindrome.toLowerCase();
        System.out.println(palindrome);
        String s1 = new StringBuffer(palindrome).reverse().toString();

//        StringBuffer sb = new StringBuffer(palindrome);
//        StringBuffer revS = sb.reverse();

        System.out.println(s1);
       // String s1 = new String(sb);

        if (s1.compareToIgnoreCase(palindrome) == 0) {
            System.out.println("Its a palidrome");
        } else {
            System.out.println("Its NOT palidrome");
        }
    }
}