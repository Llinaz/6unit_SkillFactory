public class MainForSoldier {
    public static void main(String[] args) {
        Baracks baracks = new Baracks();
        baracks.add(new Soldier("Пехотинец"));
        baracks.add(new Soldier("Рыцарь"));
        baracks.add(new Soldier("Мушкитер"));
        baracks.visit();
    }
}
