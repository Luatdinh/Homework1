public class CommissionEmployee extends Employee 
{
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) 
    {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public void setEmployeeCommissionRate(double commissionRate) 
    {
        this.commissionRate = commissionRate;
    }

    public void setEmployeeGrossSales(double grossSales)
    {
        this.grossSales = grossSales;
    }

    public double getEmployeeCommissionRate() 
    {
        return commissionRate;
    }

    public double getEmployeeGrossSales() 
    {
        return grossSales;
    }
}