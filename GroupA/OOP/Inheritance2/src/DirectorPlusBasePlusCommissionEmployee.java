public class DirectorPlusBasePlusCommissionEmployee extends BasePlusCommissionEmployee {


    private  int salary;

    public DirectorPlusBasePlusCommissionEmployee(String firstName, String lastName,
                                                  String socialSecurityNumber, double grossSales,
                                                  double commissionRate, double baseSalary, int salary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, baseSalary);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public double earnings () {
        return salary + super.earnings();
    }
    @Override
    public String toString() {
        String s = super.toString();
        return String.format(s + " Dir salary = " +salary );
    }
}
