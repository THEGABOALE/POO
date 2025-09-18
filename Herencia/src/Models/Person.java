package Models;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Introduce yourself in Spanish
     * @return A string introducing the person.
     */
    public String introduceYourself() {
        return "Hola, mi nombre es " + name + " y tengo " + age + " años.";
    }
}
