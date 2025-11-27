package Exercise3;

public class Person {
    private String name;
    private String phone;
    private String email;

    public Person(String name, String phone, String email) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }

        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Person(String name, String email) {
        this(name, email, null);
    }

    public Person(String name) {
        this(name, null, null);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", name,
                (email == null ? "" : name),
                (phone == null ? "" : phone));
    }

}