package HomeWork.Work07;

import java.io.Serializable;

public class Dog extends animal implements Serializable {

    //private static final long serialVersionUID = 1L;

    private String name;

    public Dog(){};

    public Dog(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("This is Dog " + name + " speaking.");
    }
}