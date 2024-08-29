package A20240824;

public class Elephant extends Animal{

     String name;

    public Elephant(String name, int age, double weight) {
        super(age,weight);
        this.name = name;
    }

   @Override
    public void speak(){
        super.speak();
        System.out.println(this.name);
    }
}
