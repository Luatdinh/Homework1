class Instructor 
{
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public void setInstructorFirstName(String firstName) 
    { 
        this.firstName = firstName; 
    }

    public void setInstructorLastName(String lastName) 
    { 
        this.lastName = lastName; 
    }

    public void setInstructorOfficeNumber(String officeNumber) 
    { 
        this.officeNumber = officeNumber; 
    }

    public String getInstructorFirstName() 
    { 
        return firstName; 
    }

    public String getInstructorLastName() 
    { 
        return lastName; 
    }

    public String getInstructorOfficeNumber() 
    { 
        return officeNumber; 
    }
}