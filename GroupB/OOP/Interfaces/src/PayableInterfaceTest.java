import java.util.ArrayList;

// Fig. 10.15: PayableInterfaceTest.java
// Payable interface test program processing Invoices and 
// Employees polymorphically.
public class PayableInterfaceTest 
{
   public static void main(String[] args){
      // create four-element Payable array
      //Payable[] payableObjects = new Payable[4];
      ArrayList<Payable> payableObjects = new ArrayList<>();
      // populate array with objects that implement Payable
      payableObjects.add(new Invoice("01234", "seat", 2, 375.00));
      payableObjects.add(new Invoice("56789", "tire", 4, 79.95));
      payableObjects.add(new SalariedEmployee("John", "Smith", "111-11-1111", 800.00));
      payableObjects.add(new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00));
      payableObjects.add(new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40) );
      payableObjects.add(new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06));
      payableObjects.add(new BasePlusCommissionEmployee(
                      "Bob", "Lewis", "444-44-4444", 5000, .04, 300));
      System.out.println(
         "Invoices and Employees processed polymorphically:"); 

      // generically process each element in array payableObjects
      for (Payable currentPayable : payableObjects)
      {
         // output currentPayable and its appropriate payment amount
         System.out.printf("%n%s %n%s: $%,.2f%n", 
            currentPayable.toString(), // could invoke implicitly
            "payment due", currentPayable.getPaymentAmount()); 
      } 
   } // end main
} // end class PayableInterfaceTest


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
