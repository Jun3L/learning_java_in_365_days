import java.util.*;

public class day51 {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
            new Person(3, "Junel"),
            new Person(1, "Rico"),
            new Person(2, "Joseph")
        );

        persons.sort(Comparator.comparing(Person::getName));

        persons.forEach(System.out::println);
    }
}
class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public String toString() {
        return id + " - " + name;
    }
}

