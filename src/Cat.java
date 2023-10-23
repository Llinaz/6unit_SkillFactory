import java.sql.SQLOutput;

public class Cat extends Animal{
    public Cat() {

    }
    public void sound() {
        System.out.println("Meow");
    }
    @Override
    public void move() {
        System.out.println("кошка умеет двигаться очень тихо");
    }

}
