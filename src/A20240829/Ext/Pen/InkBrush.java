package A20240829.Ext.Pen;

public class InkBrush extends Pen{

    int discount = 9;

    public InkBrush(String b, double p){
        super(b, p);
    }

    @Override
    public double getPrice(){
        return this.price * discount;
    }

    @Override
    public void write() {
        System.out.println("沾墨汁再寫");
        System.out.println("售價： " + getPrice());
    }
}
