package POSclass;
import java.lang.reflect.Member;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Grocery {
    public static final int maxFoodItems = 100;
    public static final int bitems = 10;
    static String name;
    static double amount;
    private static Food[] foodItems = new Food[maxFoodItems];
    private static String[] buy = new String[bitems];
    private static int totalFoodItems = 0;

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String input;
        StringTokenizer inputTokenizer;

        // Stock up on items
        Grocery inventory = new Grocery();
        inventory.addFoodItem(new Fruit("apple", "kg", 1.89, 200.35));
        inventory.addFoodItem(new Vegtable("Lettuce", "kg", 2.85, 66.67));
        inventory.addFoodItem(new Fruit("pear", "kg", 3.17, 321.0));
        inventory.addFoodItem(new Vegtable("cucumber", "kg", 0.78, 92.50));
        inventory.addFoodItem(new Meat("Lamb", "kg", 10.22, 112.89));

        System.out.println("Here are the foods in our grocery: ");
        inventory.printInventory();

        System.out.println("Enter <item> <amount> to buy by press [ENTER]");
        System.out.println("When you are done pls type \"done\" to finish");
        System.out.println("");

        double totalPrice = 0;
        double numOfItems = 0;

        int j = 0;
        while (!(input=scanner.nextLine()).equals("")){
            inputTokenizer = new StringTokenizer(input);
            name =inputTokenizer.nextToken();
            amount = Double.parseDouble(inputTokenizer.nextToken());
            buy[j] = name + "       "+inventory.foodItems[j].getPrice()+"       "+amount;


        }

    }

    // add a food item to the inventory
    public boolean addFoodItem(Food f){
        //  List is full
        if (totalFoodItems >= maxFoodItems){
            return false;
        }
        foodItems[totalFoodItems] = f;
        totalFoodItems++;
        return true;
    }

    public void printInventory(){
        for (int i =0; i<totalFoodItems;i++){
            System.out.println((i+1) + "\t"+foodItems[i].toString());
        }
    }


}
