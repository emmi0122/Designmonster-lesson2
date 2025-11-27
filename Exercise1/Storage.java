package Excersize1;
import java.io.*;
import java.util.*;

public class Storage {
    private final static String FILE = "persons.bin";

    @SuppressWarnings("unchecked")
    public static List<Person> fetchPersons() { // Returnerar List istället för ArrayList
        File f = new File(FILE);
        List<Person> list = null;

        try {
            if (!f.exists()) {
                System.out.println("INFO: Can't find " + FILE);
                return new LinkedList<>(); // Returnerar tom LinkedList
            }

            ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE));
            list = (List<Person>) in.readObject(); // Cast till List
            in.close();
        } catch (Exception e) {
            System.err.println("Could not load address book from " + FILE);
            return new LinkedList<>(); // Returnerar tom LinkedList vid fel
        }
        return list;
    }

    public static void save(List<Person> list) { // Tar emot List istället för ArrayList
        try {
            // Konvertera till LinkedList internt
            LinkedList<Person> linkedList = new LinkedList<>();

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE));
            out.writeObject(linkedList);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}