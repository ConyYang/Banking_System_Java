package Supermarket;

public class BeverageProduct extends GroceryProduct{
    private SugarLevel sugarLevel;

    public BeverageProduct(String name, double price, double discount, SugarLevel sugarLevel) {
        super(name, price, discount);
        this.sugarLevel = sugarLevel;
    }

    public SugarLevel getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(SugarLevel sugarLevel) {
        this.sugarLevel = sugarLevel;
    }
}
