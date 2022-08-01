package rikkei.academy;

import rikkei.academy.animals.Animals;
import rikkei.academy.animals.Chicken;
import rikkei.academy.animals.Tiger;
import rikkei.academy.edible.IEdible;
import rikkei.academy.fruit.Apple;
import rikkei.academy.fruit.Fruit;
import rikkei.academy.fruit.Orange;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animals animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }

        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}