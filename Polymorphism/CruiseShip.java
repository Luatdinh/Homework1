public class CruiseShip extends Ship 
{
    private int maxNumberOfPassengers;

    public CruiseShip(String name, String buildingYear, int maxNumberOfPassengers) 
    {
        super(name, buildingYear);
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) 
    {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public int getMaxNumberOfPassengers() 
    {
        return maxNumberOfPassengers;
    }

    @Override
    public void print() 
    {
        System.out.print("The ship's name is " + getShipName());
        System.out.println(", and a maximum number of passengers that the ship can carry is " + maxNumberOfPassengers + " passengers.");
    }
}