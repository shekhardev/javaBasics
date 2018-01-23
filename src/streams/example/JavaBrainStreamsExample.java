package streams.example;

import java.util.Arrays;
import java.util.List;

public class JavaBrainStreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Tim","bob",60),
                new Person("Chris","Carroll",60),
                new Person("Matthew","Caryle",60),
                new Person("Tim","bob",60)
        );
        people.stream()
                .filter(p-> p.getLastName().startsWith("C"))
                .forEach(p-> System.out.println(p.getFirstName()));
    }
}
