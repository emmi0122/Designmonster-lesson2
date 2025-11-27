package Excersize1;
import java.util.LinkedList;
import java.util.List;

public class CreatePersons {
    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();

        persons.add(new Person("Anna Bengtsson", "anna.bengtsson@example.com"));
        persons.add(new Person("Bengt Andersson", "bengt.andersson@example.com"));
        persons.add(new Person("Cecilia Carlsson", "cecilia.carlsson@example.com"));

        Storage.save(persons);

        System.out.println("Saved " + persons.size() + " persons to file");
    }
}
