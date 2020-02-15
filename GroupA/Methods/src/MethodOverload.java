// Fig. 6.10: MethodOverload.java
// Overloaded method declarations.

public class MethodOverload 
{
   // test overloaded square methods
   public static void main(String[] args)
   {
      MethodOverload mo = new MethodOverload();
      System.out.printf("Square of integer 7 is %d%n", mo.square(7));
      System.out.printf("Square of double 7.5 is %f%n", mo.square(7.5));
      System.out.printf("Multiple of doubles %f%n", mo.square(7.5,8.9));
   }
   
   // square method with int argument
   public int square(int intValue)
   {
      System.out.printf("%nCalled square with int argument: %d%n", 
         intValue);
      return intValue * intValue;
   }

   // square method with double argument
   public double square(double doubleValue)
   {
      System.out.printf("%nCalled square with double argument: %f%n",
         doubleValue);
      return doubleValue * doubleValue;
   }

   public double square(double doubleValue, double doubleValue1)
   {
      System.out.printf("%nCalled Multiple with double arguments: %f %f\n",
              doubleValue,doubleValue1);
      return doubleValue * doubleValue1;
   }

   @Override
   public String toString() {
      return super.toString();
   }
} // end class MethodOverload

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
