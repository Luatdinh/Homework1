public class HourlyEmployee extends Employee 
{
    private double wage;
    private double numberOfHoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double numberOfHoursWorked) 
    {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public void setEmployeeWage(double wage) 
    {
        this.wage = wage;
    }

    public void setEmployeeNumberOfHoursWorked(double numberOfHoursWorked) 
    {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getEmployeeWage() 
    {
        return wage;
    }

    public double getEmployeeNumberOfHoursWorked() 
    {
        return numberOfHoursWorked;
    }
}