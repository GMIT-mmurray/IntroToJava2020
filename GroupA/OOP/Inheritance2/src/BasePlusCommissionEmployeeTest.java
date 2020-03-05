// Fig. 9.7: BasePlusCommissionEmployeeTest.java
// BasePlusCommissionEmployee test program.

public class BasePlusCommissionEmployeeTest 
{
   public static void main(String[] args) 
   {
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee = 
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
      
      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000);
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
         employee.toString());
      System.out.printf(" Earnings %.2f",employee.earnings());

      // -------------------------------------------------------

      CommissionEmployee employee1 =
              new CommissionEmployee(
                      "michael", "murray", "zzzzzzzzzz", 555000, .08);

      // get base-salaried commission employee data
      System.out.println(
              "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
              employee1.getFirstName());
      System.out.printf("%s %s%n", "Last name is",
              employee1.getLastName());
      System.out.printf("%s %s%n", "Social security number is",
              employee1.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is",
              employee1.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
              employee1.getCommissionRate());

        System.out.printf("%n%s:%n%n%s%n",
              "Updated employee information obtained by toString",
              employee1.toString());
      System.out.printf(" Earnings %.2f%n",employee1.earnings());

     DirectorPlusBasePlusCommissionEmployee dbce =
             new DirectorPlusBasePlusCommissionEmployee("Jim","long",
             "111111111",100,00.1,100000,50000);

      System.out.printf(" Earnings from dbce %.2f%n",dbce.earnings());
      System.out.println(dbce instanceof CommissionEmployee);
      System.out.println(employee1 instanceof CommissionEmployee);
      System.out.println(employee instanceof CommissionEmployee);
      System.out.println(employee instanceof DirectorPlusBasePlusCommissionEmployee);
   } // end main



} // end class BasePlusCommissionEmployeeTest


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
