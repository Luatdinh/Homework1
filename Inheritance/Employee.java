public class Employee 
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setEmployeeFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public void setEmployeeLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public void setEmployeeSocialSecurityNumber(String socialSecurityNumber) 
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getEmployeeFirstName() 
    {
        return firstName;
    }

    public String getEmployeeLastName() 
    {
        return lastName;
    }

    public String getEmployeeSocialSecurityNumber() 
    {
        return socialSecurityNumber;
    }
}