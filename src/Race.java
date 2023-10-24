public class Race {
    private String name;
    protected int health;
    private int damage;
    private boolean isAlive = true;

    public Race(String name, int health, int damage) {
        this.damage = damage;
        this.health = health;
        this.name = name;
    }

    public Race() {
        this("Creature",100,10);
    }

    public Race(int health, int damage) {
        this("Creature",health,damage);
    }

    public void battleCry() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    public void attack(Race race) {
        this.battleCry();
        race.health -= this.damage;
        if (race.health < 0) {
            race.isAlive = false;
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return isAlive;
    }
}
