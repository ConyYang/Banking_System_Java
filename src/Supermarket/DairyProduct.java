package Supermarket;

public class DairyProduct extends GroceryProduct{
    private Fat fat;
    public DairyProduct(String name, double price, double discount, Fat fat) {
        super(name, price, discount);
        this.fat = fat;
    }

    @Override
    public String display() {
        return (super.display() + "\n Fat Level: "+ fat);
    }

    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }
}
