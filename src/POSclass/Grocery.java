package POSclass;
import java.lang.reflect.Member;
import java.util.NoSuchElementException;
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
        while (!(input=scanner.nextLine()).equals("done")){
            inputTokenizer = new StringTokenizer(input);
            try {
                name =inputTokenizer.nextToken();
                amount = Double.parseDouble(inputTokenizer.nextToken());
                int food_idx = 0;
                boolean flag = false;

                for (int i =0; i< inventory.totalFoodItems; i++){
                    if (inventory.foodItems[i].getName().equals(name)) {
                        flag = true;
                        food_idx = i;
                        break;
                    }
                } // for loop

                if (flag){
                    buy[j] = name + "       "+inventory.foodItems[j].getPrice()+"       "+amount;
//                    for (int i =0; i< inventory.totalFoodItems; i++){
//                        if (inventory.foodItems[i].getName().equals(name)){
//                            inventory.foodItems[i].decreaseStock(amount);
//                            totalPrice += amount*inventory.foodItems[i].getPrice();
//                            break;
//                        }
//                    }
                    inventory.foodItems[food_idx].decreaseStock(amount);
                    totalPrice += amount*inventory.foodItems[food_idx].getPrice();
                    numOfItems++;
                    j++;
                }
                else
                    System.out.println("There is no such food! ");

            } catch (NoSuchElementException e) {
                System.out.println("You Entered WRONG FORMAT! ");
                System.out.println("Pls follow this format: Enter <item> <amount> to buy by press [ENTER]");

            }

        }
        System.out.println("Payment Details: ");
        System.out.println("------------------");
        double finalCost = totalPrice;
        System.out.println("Your total payment is $ "+(int)(finalCost*100)/100.0);

        // Print results
        System.out.println("\nDo you want to proceed (y/n) ?");
        Scanner input1 = new Scanner(System.in);
        String char_input = input1.next();
        char char_Choice = char_input.charAt(0);

        if (char_Choice == 'y' || char_Choice == 'Y'){
            System.out.println("\n");
            System.out.println("Updated Inventory: ");
            System.out.println("-------------------");
            inventory.printInventory();

            System.out.println("\nPlease enter 'y' or 'Y' for receipt: ");
            Scanner input2 = new Scanner(System.in);
            String char_input_2 = input2.next();
            char char_Choice_2 = char_input_2.charAt(0);

            if (char_Choice_2 == 'y' || char_Choice_2 == 'Y'){
                System.out.println("\n\n");
                System.out.println("------------------------------------------------------------------");
                System.out.println("                Grocery Store\n");
                System.out.println("                RECEIPT         ");
                System.out.println("              ---------------\n");
                System.out.println("Item            "+"Unit Price               "+"Amount");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                for (int i=0;i<numOfItems;i++){
                    System.out.println(buy[i].toString());
                }
                System.out.println("\n          Total number of items purchased: "+numOfItems);
                System.out.println("\n          The subtotal is $ "+ (int)(totalPrice*100)/100.0);
                System.out.println("\n          End  of Receipt");
                System.out.println("\n          Thank you for shopping with us ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            } // print receipt
            input2.close();
        } // if statement of input 1
        else {
            System.out.println("Thank you for shopping with us");
        }
        scanner.close();
        input1.close();
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
