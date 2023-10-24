public class Dragon extends Race{
    public Dragon() {

    }

    public Dragon(int health, int damage) {
        super(health, damage);
    }

    public Dragon(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void battleCry() {
        System.out.println("GGRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRGRGRG");
    }
 }
