package Excersize1;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Nu använder vi List - vi vet inte och bryr oss inte om det är en ArrayList eller LinkedList
        List<Person> persons = Storage.fetchPersons();

        // Make the capacity no bigger than the number of elements
        //persons.trimToSize(); vi behöver inte veta om implementationen

        System.out.println(persons);
    }
}