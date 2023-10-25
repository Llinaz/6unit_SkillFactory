public class Designer extends Employee {
    private String designProgram;

    public Designer() {

    }

    public String getDesignProgram() {
        return designProgram;
    }

    public void setDesignProgram(String designProgram) {
        this.designProgram = designProgram;
    }

    public Designer(String name, int age, String position, int expirience, int salary, String designProgram) {
        super(name, age, position, expirience, salary);
        this.designProgram = designProgram;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Work with program: " + designProgram + "\n");
    }
}
