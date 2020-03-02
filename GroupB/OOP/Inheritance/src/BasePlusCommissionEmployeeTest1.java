// Fig. 9.9: BasePlusCommissionEmployeeTest.java
// BasePlusCommissionEmployee test program.

public class BasePlusCommissionEmployeeTest1
{
   public static void main(String[] args) 
   {
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee1 employee =
         new BasePlusCommissionEmployee1(
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

      BasePlusCommissionPlusDirector bpcd = new BasePlusCommissionPlusDirector("michael","murray",
                                         "123456",12333.5,0.3,
                                          1234.4,4000.0);
      System.out.println(bpcd);

      System.out.println(bpcd instanceof BasePlusCommissionEmployee1);
      System.out.println(bpcd instanceof BasePlusCommissionPlusDirector);
      System.out.println(bpcd instanceof CommissionEmployee1);
      System.out.println(bpcd instanceof Object);
      System.out.println(employee instanceof BasePlusCommissionEmployee1);
      System.out.println(employee instanceof BasePlusCommissionPlusDirector);
   } // end main
} // end class BasePlusCommissionEmployeeTest


