/*
this is  a project that outputs my name, age and hobby
*/
import java.util.Scanner;

public class MyDetails {
    // This is  the entry point of a  Java program]
    public static void main (String arg[]){
        //Variables
        String name = "Cony Yang", hobby =  "Coding";
        int bornYear = 2001, age=19, currentYear=2020;
        boolean older_21=false;
        double sum=0, prereqMark, avgScore=67.345;
        Scanner input = new Scanner(System.in);
        //changing age
        age = 20;

        // User Input
        System.out.println("What is your name? ");
        name = input.nextLine();
        System.out.println("What is your hobby? ");
        hobby = input.nextLine();

        // Show Result
        System.out.println("My Details");
        System.out.println("----------");
        System.out.print("Name : "+name);
        System.out.print("  Hobby: "+hobby);
        System.out.println();
        System.out.println("Year of Birth: "+bornYear);
        System.out.printf("Average score: %.1f", avgScore);

    }

}
