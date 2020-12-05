public class Food {
    private String name;
    private String measurement;
    private double price;
    private double stock;

    public Food(String name, String measurement, double price, double stock){
        this.name = name;
        this.measurement = measurement;
        this.price = price;
        this.stock = stock;
    } // constructor

    public String getName(){
        return name;
    } // get name

    public double getPrice(){
        return price;
    } // get price

    public boolean decreaseStock(double amount){
        if (amount<=stock){
            stock -= amount;
            System.out.println(amount+"are sold");
            return true;
        }else {
            System.out.println("The amount exceed stock!");
            return false;
        }
    } // decrease stock

    public String toString(){
        return name + "," +  "$" + price + "/" + measurement + "," +
                stock + " "+measurement + " in stock";
    }
}
