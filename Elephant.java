
package vu.animal;

public class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("An Elephant Trumpet");
    }

    @Override
    public void eat() {
        System.out.println("And it Eats grass");
    }
}