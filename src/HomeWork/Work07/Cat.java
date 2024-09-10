package HomeWork.Work07;

import java.io.Serializable;

public class Cat extends animal implements Serializable {

    //private static final long serialVersionUID = 1L;

    private String name;

    public Cat(){};

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("This is Cat " + name + " speaking!");
    }

}
