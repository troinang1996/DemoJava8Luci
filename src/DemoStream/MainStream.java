package DemoStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Nguyen", "Khang", 1996),
                new Person("Nguyen", "Tuan", 2000),
                new Person("Tran", "Hung", 1972),
                new Person("Tran", "Hung", 1972),
                new Person("Vu", "Minh", 2003),
                new Person("Do", "Duong", 1983),
                new Person("Nguyen", "Khang", 1995)
        );
        list.stream().filter(x -> x.getElectionYear() < 2000)
                .limit(3)
                .forEach(x -> System.out.println(x.toString()));
        Long i = list.stream().filter(x -> x.getElectionYear() < 2000)
                .count();
        System.out.println(i);
        String result = list.stream().map(Person::getLastName)
                .distinct()
                .reduce("Sum Name", String::concat);
        System.out.println(result);
        Integer sum = list.stream().
                map(Person::getElectionYear)
                .reduce(0, Integer :: sum);
        System.out.println(sum);
        list.stream().sorted(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getElectionYear()- o2.getElectionYear();
            }
        })

                .forEach(System.out::println);
        // so danh steam va parallel steam
        String steam = list.stream().map(Person::getFirstName)
                .distinct()
                .reduce("Sum Name", String::concat);
        System.out.println(steam);
        String parallelStream = list.parallelStream().map(Person::getFirstName)
                .distinct()
                .reduce("Sum Name", String::concat);
        System.out.println(parallelStream);


    }

}
