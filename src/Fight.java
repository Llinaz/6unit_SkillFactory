public class Fight {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Eragon", 100,80);
        Fairy fairy = new Fairy("Maas",170,40);
        fight(dragon, fairy);
    }

    private static void fight(Race first, Race second) {
        while (second.isAlive() && first.isAlive()) {
            first.attack((second));
            second.attack(first);
        }

        if (first.isAlive()) {
            System.out.printf("%s with name %s is dead\n", second.getClass().getSimpleName(), second.getName());
            System.out.printf("%s with name %s is win", first.getClass().getSimpleName(), first.getName());
    } else if (second.isAlive()) {
            System.out.printf("%s with name %s is dead\n", first.getClass().getSimpleName(), first.getName());
            System.out.printf("%s with name %s is win", second.getClass().getSimpleName(), second.getName());
        } else {
            System.out.println("All are dead ....");
        }
    }
    }
