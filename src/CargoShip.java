public class CargoShip extends Ship {
    private int tonnage;

    public CargoShip(String name, int yearOfManufacture, int tonnage) {
        super(name, yearOfManufacture);
        this.tonnage = tonnage;
    }

    public String toString() {
        return super.toString().replace("."," ") + String.format(" и способно перевезти %d тонн 1 груза.",tonnage);
    }
}
