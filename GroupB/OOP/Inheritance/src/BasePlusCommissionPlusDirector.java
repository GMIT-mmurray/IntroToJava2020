public class BasePlusCommissionPlusDirector extends BasePlusCommissionEmployee1 {

    private final double directorSalary;


    public BasePlusCommissionPlusDirector(String firstName, String lastName, String socialSecurityNumber,
                                          double grossSales, double commissionRate, double baseSalary, double salary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, baseSalary);
        directorSalary = salary;
    }

    @Override
    public double earnings()
    {
        // not allowed: commissionRate and grossSales private in superclass
        return directorSalary + super.earnings();
    }

    @Override
    public String toString() {

    return String.format("%s : %s  Earnings %.2f%n",super.firstName,super.lastName, earnings());
    }

}
