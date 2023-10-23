public class Stringed extends MusicalInstrument {
    int quantityOfStrings;

    public Stringed(String name, String munafacturer, int price, int quantityOfStrings) {
        super(name, munafacturer, price);
        this.quantityOfStrings =quantityOfStrings;
    }

    public String play() {
        return name + " sounds beatiful";
    }
}
