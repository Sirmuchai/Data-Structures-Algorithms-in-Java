package java_streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args){
    List<Person> people = getPeople();

    //Use Declarative approach
    //1. Filter
    System.out.println("--Filter--");
    List<Person> female = people.stream()
      .filter(person -> person.getGender().equals(Gender.FEMALE))
      .toList();
    female.forEach(System.out::println);

    System.out.println("--Sorting--");
    // 2. Sort
    List<Person> sorted = people.stream()
      .sorted(Comparator.comparing(Person::getAge).reversed())
      .toList();
    sorted.forEach(System.out::println);

    // 3. AllMatch
    System.out.println("--All Matching--");
    boolean allMatch = people.stream()
      .allMatch(person -> person.getAge()<30);
    System.out.println(allMatch);

    // 4. Any match
    System.out.println("--Any Matching--");
    boolean anyMatch = people.stream()
      .anyMatch(person -> person.getAge()<30);
    System.out.println(anyMatch);

    // 5. Max age
    System.out.println("--Max Age--");
    people.stream()
      .max(Comparator.comparing(Person::getAge))
      .ifPresent(System.out::println);

    // 6. Min Age
    System.out.println("--Min Age--");
    people.stream()
      .min(Comparator.comparing(Person::getAge))
      .ifPresent(System.out::println);

    // 7. Get female with max age
    Optional<String> oldestFemaleAge = people.stream()
      .filter(person -> person.getGender().equals(Gender.FEMALE))
      .max(Comparator.comparing(Person::getAge))
      .map(Person::getName);

    oldestFemaleAge.ifPresent(System.out::println);
  }

  private static List<Person> getPeople(){
    return List.of(
      new Person("Sammy", 32, Gender.MALE),
      new Person("Hotani", 2, Gender.MALE),
      new Person("Grace", 27, Gender.FEMALE),
      new Person("Kezia", 20, Gender.FEMALE),
      new Person("Barnabas", 25, Gender.MALE),
      new Person("Cinter", 30, Gender.FEMALE)
    );
  }
}


