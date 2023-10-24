public class PassengerShip extends Ship {
    private int numberOfPassengers;

    public PassengerShip(String name, int yearOfManufacture, int numberOfPassengers) {
        super(name, yearOfManufacture);
        this.numberOfPassengers = numberOfPassengers;
    }

    public String toString() {
        return super.toString().replace(".", " ") + String.format(" и способно принять на борт %d пассажтров.", numberOfPassengers);
    }
}
