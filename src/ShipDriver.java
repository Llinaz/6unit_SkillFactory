public class ShipDriver {
    public static void main(String[] args) {
        Ship ship = new Ship("Ever Given", 2018);
        PassengerShip passengerShip = new PassengerShip("Мустай Карим",2020,470);
        CargoShip cargoShip = new CargoShip("FESCO", 2020,42000);
        System.out.println(ship.toString());
        System.out.println(passengerShip.toString());
        System.out.println(cargoShip.toString());
    }
}
