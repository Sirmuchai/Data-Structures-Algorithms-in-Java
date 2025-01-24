package java_streams;


public class Person {
  private final String name;
  private final Integer age;
  private final Gender gender;

  public Person(String name, Integer age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Gender getGender() {
    return gender;
  }

  public Integer getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", age=" + age +
      ", gender=" + gender +
      '}';
  }
}
