package POSclass;

public class Fruit extends Food{

    public Fruit(String name, String measurement, double price, double stock) {
        super(name, measurement, price, stock);
    }

    @Override
    public String toString() {
        return "Fruit"+super.toString();
    }
}
