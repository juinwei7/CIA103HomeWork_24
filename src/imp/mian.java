package imp;

public class mian {
    public static void main(String... args){

        WeightMethod dog = new Dog("dog_w",  15);
        WeightMethod plane = new Plane("戰鬥機", 10000);
        WeightMethod poeder = new Powder("粉色", 0.5);

        WeightMethod[] weightMethods = {dog, plane, poeder};

        for (WeightMethod w: weightMethods){
            System.out.print("使用工具： ");

           w.printWeightTool();
        }
    }
}
