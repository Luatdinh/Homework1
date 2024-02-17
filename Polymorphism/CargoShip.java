public class CargoShip extends Ship 
{
    private int cargoCapacity;

    public CargoShip(String name, String buildingYear, int cargoCapacity) 
    {
        super(name, buildingYear);
        this.cargoCapacity = cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacityInTonnage) 
    {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() 
    {
        return cargoCapacity;
    }

    @Override
    public void print() 
    {
        System.out.print("The ship's name is " + getShipName()); 
        System.out.println(", and its cargo capacity in tonnage is " + cargoCapacity + ".");
    }
}