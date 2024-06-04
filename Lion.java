
package vu.animal;


public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The Lion Roar");
    }

    @Override
    public void eat() {
        System.out.println("And its Eats meat");
    }
}