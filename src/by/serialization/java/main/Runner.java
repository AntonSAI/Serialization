package by.serialization.java.main;

import by.serialization.java.main.entity.Beagle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        FileOutputStream fileOutputStream = new FileOutputStream("src/resources/save.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        List<Beagle> beagles = new ArrayList<>();
//
//        beagles.add(new Beagle("Maggi", "red", 10, 14.0));
//        beagles.add(new Beagle("Maddy", "red", 8, 12.0));
//        beagles.add(new Beagle("Avy", "black", 5, 10.0));
//
//        objectOutputStream.writeObject(beagles);
//        objectOutputStream.flush();
//        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src/resources/save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        beagles = (List<Beagle>) objectInputStream.readObject();
    }
}
