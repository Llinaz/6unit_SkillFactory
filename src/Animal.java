public class Animal {
    private boolean vegetarian;
    private String eats;


    public Animal() {
    }

    public void sound() {

    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void move() {
        System.out.println("Животные могут двигаться");
    }
}