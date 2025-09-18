package Models;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age, "dog.wav");
    }

    public void present() {
        System.out.println("El perro " + super.name + " tiene " + super.age + " años");
    }
}
