public class BaseEmployee extends Employee 
{
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) 
    {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public void setEmployeeBaseSalary(double baseSalary) 
    {
        this.baseSalary = baseSalary;
    }

    public double getEmployeeBaseSalary() 
    {
        return baseSalary;
    }
}