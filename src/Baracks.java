public class Baracks {
    Soldier[] army;
    int count;

    public Baracks() {
        army = new Soldier[3];
        count = 0;
    }

    public void add(Soldier soldier) {
        if (count < army.length) {
            army[count] = soldier;
            count++;
        } else {
            System.out.println("Мест не хватает");
        }
    }

    public void visit() {
        for (int i = 0; i < army.length; i++) {
            if (army[i] != null) {
                army[i].sound();
            }
        }
    }
}

