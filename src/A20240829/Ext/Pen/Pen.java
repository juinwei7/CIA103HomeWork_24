package A20240829.Ext.Pen;

abstract class Pen {
    String brand;
    double price;

    public Pen(){}

    public Pen(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getBrand(){
        return this.brand;
    }

    public double getPrice(){
        return this.price;
    }

    abstract void write();
}
