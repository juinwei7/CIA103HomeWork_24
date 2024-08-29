package A20240824;

public class Animal {
    private int age;
    private double weight;

    public Animal(int age, double weight){
        this.age = age;
        this.weight = weight;
    }

    public void speak(){
        System.out.println("年紀： " + age + "，體重： " + weight);
    }

}
