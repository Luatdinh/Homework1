import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Driver 
{
    private static void printEmployeeInformation(Employee employee) 
    {

    String baseSalary = "", weeklySalary = "", wage = "", hoursWorked = "", commissionRate = "", grossSales = "";

    if (employee instanceof SalariedEmployee) 
    {
        weeklySalary = String.format("$%,.0f", ((SalariedEmployee) employee).getEmployeeWeeklySalary());
    }
    if (employee instanceof HourlyEmployee) 
    {
        wage = String.format("$%.0f", ((HourlyEmployee) employee).getEmployeeWage());
        hoursWorked = String.format("%d", (int) ((HourlyEmployee) employee).getEmployeeNumberOfHoursWorked());
    }
    if (employee instanceof CommissionEmployee) 
    {
        commissionRate = String.format("%.0f%%", ((CommissionEmployee) employee).getEmployeeCommissionRate() * 100);
        grossSales = String.format("$%,.0f", ((CommissionEmployee) employee).getEmployeeGrossSales());
    }
    if (employee instanceof BaseEmployee) 
    {
        baseSalary = String.format("$%,.0f", ((BaseEmployee) employee).getEmployeeBaseSalary());
    }

    System.out.printf("| %-12s | %-12s | %-15s | %-15s | %-8s | %-14s| %-11s | %-14s| %-12s |%n",
        employee.getEmployeeFirstName(),
        employee.getEmployeeLastName(),
        employee.getEmployeeSocialSecurityNumber(),
        weeklySalary,
        wage,
        hoursWorked,
        commissionRate,
        grossSales,
        baseSalary
    );
}

    public static void main(String[] args) 
    {
        System.out.println("+--------------+--------------+-----------------+-----------------+----------+---------------+-------------+---------------+--------------+");
        System.out.printf("| %-10s   | %-10s   | %-11s    | %-13s   | %-6s   | %-12s  | %-9s   | %-13s | %-10s  |%n",
            "First Name", "Last Name", "Social Sec #", "Weekly Salary", "Wage", "Hours worked", "Com rate", "Gross salary", "Base Salary"
        );
        System.out.println("+--------------+--------------+-----------------+-----------------+----------+---------------+-------------+---------------+--------------+");
       

        Employee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        Employee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        Employee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        Employee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        Employee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        Employee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        Employee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        printEmployeeInformation(joe);
        printEmployeeInformation(stephanie);
        printEmployeeInformation(mary);
        printEmployeeInformation(nicole);
        printEmployeeInformation(renwa);
        printEmployeeInformation(mike);
        printEmployeeInformation(mahnaz);

        System.out.println("+--------------+--------------+-----------------+-----------------+----------+---------------+-------------+---------------+--------------+");
       
    }
}
