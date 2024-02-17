public class Ship 
{
    private String name;
    private String buildingYear;

    public Ship(String name, String buildingYear) 
    {
        this.name = name;
        this.buildingYear = buildingYear;
    }

    public void setshipName(String shipName) 
    {
        this.name = name;
    }

    public void setbuildingYearOfShip(String buildingYear) 
    {
        this.buildingYear = buildingYear;
    }

    public String getShipName() 
    {
        return name;
    }

    public String getbuildingYearOfShip() 
    {
        return buildingYear;
    }

    public void print() 
    {
        System.out.print("The ship's name is " + name);
        System.out.println(", and it was built in " + buildingYear +".");
    }
}