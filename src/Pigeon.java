public class Pigeon extends Bird{
    int hunger;

    public int getHunger() {
        return hunger;
    }

    public Pigeon(String[] continents, int population, int hunger) {
        super("pigeon",continents,population);
        this.hunger= hunger;
    }

    public void askForSeeds() {
        hunger -= 7;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void sleep() {
        hunger += 3;
    }


}
