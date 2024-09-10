package HomeWork.Work07;

abstract class animal {



    String name;

    public animal(){};

    public animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

     abstract void speak();
}
