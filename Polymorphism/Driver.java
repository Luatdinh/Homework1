public class Driver 
{
    public static void main(String[] args) 
    {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Santa Maria", "1460");
        ships[1] = new CruiseShip("RMS Lusitania", "1906", 1266);
        ships[2] = new CargoShip("Mayflower", "1607", 180);

        for (Ship ship : ships) 
        {
            ship.print();
            System.out.println();
        }
    }
}