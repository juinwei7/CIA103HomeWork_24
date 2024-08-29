package A20240829.Ext.Pen;

public class Pencil extends Pen{

    int discount = 8;

    public Pencil(String b, double p){
        super(b, p);
    }

    @Override
    public double getPrice(){
        return this.price * discount;
    }

    @Override
    void write() {
        System.out.println("削鉛筆再寫");
        System.out.println("售價： " + getPrice());
    }
}
