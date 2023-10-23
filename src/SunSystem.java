public class SunSystem extends StarSystem{
        private long population;

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public SunSystem(int quantityOfPlanets, int age, long population) {
        super("sun", quantityOfPlanets, age);
        this.population = population;
    }
}
