public class Fairy extends Race{
    public Fairy() {
    }

    public Fairy(int health, int damage) {
        super(health, damage);
    }

    public Fairy(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void battleCry() {
        System.out.println("Yiiiiiiiiiiiiiiiii");
    }
}
