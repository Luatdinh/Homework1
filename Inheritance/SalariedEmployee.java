public class SalariedEmployee extends Employee 
{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) 
    {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public void setEmployeeWeeklySalary(double weeklySalary) 
    {
        this.weeklySalary = weeklySalary;
    }

    public double getEmployeeWeeklySalary() 
    {
        return weeklySalary;
    }
}