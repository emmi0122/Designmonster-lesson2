package Exercise3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Anna");
        Person p2 = new Person("Bob", "bob@example.com");
        Person p3 = new Person("Charlie", "charlie@example.com", "123-456");
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        try {
            Person p4 = new Person(null);
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
