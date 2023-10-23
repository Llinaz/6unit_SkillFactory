public class Knight extends Soldier {
    public Knight(String name, int price, String phrase) {
        super(name);
        this.price = 245;
        this.phrase = "Наше дело правое, а врага - найдем";
    }

    public void feed() {
        System.out.println(this.name + " Кормит коня");
    }
}
