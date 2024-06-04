
package vu.animal;

import java.util.Scanner;


public class Zoo {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter animal name: ");
        String animalName = scanner.nextLine();

        Animal animal;

        if (animalName.equalsIgnoreCase("lion")) {
            animal = new Lion(animalName, 2);
        } else if (animalName.equalsIgnoreCase("elephant")) {
            animal = new Elephant(animalName, 10);
        } else if (animalName.equalsIgnoreCase("monkey")) {
            animal = new Monkey(animalName, 5);
        } else {  return;
        }
            System.out.println("Invalid animal name");
          

        animal.makeSound();
        animal.eat();
        scanner.close();
    }
}  


