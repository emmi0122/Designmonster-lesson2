public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Anna", "IT", new Role("Engineer"));
        System.out.println(employee);

        employee.addRole(new Role("Manager"));
        System.out.println(employee);
    }
}
