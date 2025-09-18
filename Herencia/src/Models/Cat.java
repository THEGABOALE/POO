package Models;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, "cat.wav");
    }

    public void present() {
        System.out.println("El gato " + super.name + " tiene " + super.age + " años");
    }
}
