package A20240824;

public class PolyAnimal {
    public static void main(String[] args){

        Animal elephant1 = new Elephant("大象1", 8, 800);
        Animal elephant2 = new Elephant("大象2", 8, 800);
        Animal elephant3 = new Elephant("大象3", 8, 800);

        Animal animal = new Animal(8,10.0f);

        elephant2.speak();

        animal.speak();


    }
}
