package run;

import Models.Cat;
import Models.Dog;
import Models.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Dominik Navarro", 18, "Ingniería en Sistemas");
        System.out.println(student.introduceYourself());

        Dog dog = new Dog("Firulais", 7);
        Cat cat = new Cat("Garfield", 8);

        dog.present();
        dog.sonido();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        cat.present();
        cat.sonido();
    }
}
