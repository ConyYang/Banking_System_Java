package POSclass;

public class Vegtable extends Food{
    public Vegtable(String name, String measurement, double price, double stock) {
        super(name, measurement, price, stock);
    }

    @Override
    public String toString() {
        return "Vegetable: " + super.toString();
    }
}
