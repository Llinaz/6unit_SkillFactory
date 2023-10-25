public class Employee {
    protected String name;
    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    protected String position;
    protected int experience;
    protected int salary;
    private int countOfEmployees = 0;

    public Employee() {
        countOfEmployees++;
    }

    public Employee(String name, int age, String position, int experience, int salary) {
        this.name= name;
        this.age = age;
        this.position = position;
        this.experience = experience;
        this.salary = salary;
        countOfEmployees++;
    }

    public void getInfo() {
        System.out.println("Company member: " + name + "\nAge: " + age + "\nPosition: " + position + "\nExpiriens in company: " + experience + "\nSalary: " + salary);
    }

    public void getCountOfEmployees() {
        System.out.println("The company has " + countOfEmployees + " employees");
    }
}
