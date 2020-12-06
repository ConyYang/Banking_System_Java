package POSclass;

public class Meat extends Food{

    public Meat(String name, String measurement, double price, double stock) {
        super(name, measurement, price, stock);
    }

    @Override
    public String toString() {
        return "Meat: " + super.toString();
    }
}
