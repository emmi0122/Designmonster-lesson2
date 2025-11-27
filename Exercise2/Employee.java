import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private String name;
    private String department;
    private List<Role> roles;

    public Employee(String name, String department, Role initiaRole) {
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>();
    }

    public String name() {
        return name;
    }

    public String department() {
        return department;
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" at ").append(department);
        sb.append(" - Roles: ");

        for (Role role : roles) {
            sb.append(role.name()).append(" ");
        }

        return sb.toString();
    }
}