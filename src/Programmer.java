public class Programmer extends Employee{
    private String language;

    public Programmer() {

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Programmer(String name, int age, String position, int experience, int salary, String language) {
        super(name, age, position, experience, salary);
        this.language = language;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Programming language: " + language + "\n");
    }
}
