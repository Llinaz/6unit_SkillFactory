public class MainForTask5 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Programmer programmer = new Programmer();
        Designer designer = new Designer();
        Employee employeeProgrammer = new Programmer("Andrey", 28,"Programmer", 3, 90_000,"Java");
        Employee employeeDesigner = new Designer("Alina",29,"Designer",5, 50_000, "Adobe Illustrator");
        employeeProgrammer.getInfo();
        System.out.println();
        employeeDesigner.getInfo();
        employee.getCountOfEmployees();
    }
}
