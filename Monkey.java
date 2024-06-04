package vu.animal;

public class Monkey extends Animal {

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("A Monkey Chatters");
    }

    @Override
    public void eat() {
        System.out.println("And it Eats bananas");
    }
}

