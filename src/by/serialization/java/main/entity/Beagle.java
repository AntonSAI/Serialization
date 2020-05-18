package by.serialization.java.main.entity;

import java.io.Serializable;

public class Beagle extends Dog implements Serializable {
    private String name;
    private String color;
    private transient int age;
    private transient double sizeWithers;

    public Beagle() {
    }

    public Beagle(String name, String color, int age, double sizeWithers) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.sizeWithers = sizeWithers;
    }

    @Deprecated
    public void guard() {
    }

    @Override
    public boolean isDomastic(Object o) {
        return false;
    }

    public void play() {
        playWithBall();
    }

    private void playWithBall() {
        System.out.println("play with ball");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSizeWithers() {
        return sizeWithers;
    }

    public void setSizeWithers(double sizeWithers) {
        this.sizeWithers = sizeWithers;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", sizeWithers=" + sizeWithers +
                '}';
    }
}
