package Homework6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws  IOException {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Rat");
        animals[1] = new Animal("Cat");
        animals[2] = new Animal("Fox");

        ObjectOutputStream outAnimals = new ObjectOutputStream(new FileOutputStream("animals.dat"));
        outAnimals.writeObject(animals.length);
        deserializeAnimals(outAnimals);
    }

    public static void deserializeAnimals(Object data) throws IOException {
        ObjectInputStream inAnimals =  new ObjectInputStream (new FileInputStream("animals.dat"));
    }
}