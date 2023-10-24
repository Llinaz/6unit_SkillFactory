public class Ship {
    protected String name;
    protected int yearOfManufacture;

    public Ship(String name, int yearOfManufacture) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String toString() {
        return "Судно " + name + " построено в " + yearOfManufacture + " году.";
    }
}
