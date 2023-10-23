public class Aeroplane extends Aircraft {
    int winsdpan;

    public Aeroplane(int number, int speed, int wingspan) {
        super(number, speed);
        this.winsdpan = wingspan;
    }
}
