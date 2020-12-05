package MyDetails;/*
this is  a project that outputs my name, age and hobby
*/
import java.util.Scanner;

public class MyDetails {
    // This is  the entry point of a  Java program]
    public static void main (String[] arg){
        //Variables
        String name = "Cony Yang", hobby =  "Coding";
        int bornYear = 2001, age=19, currentYear=2020;
        boolean older_21=true;
        double sum=0, prereqMark, avgScore=67.345;
        Scanner input = new Scanner(System.in);

        // User Input
        System.out.println("What is your name? ");
        name = input.nextLine();

        System.out.println("What is your hobby? ");
        hobby = input.nextLine();

        System.out.println("Which year are you born");
        bornYear = input.nextInt();

        for (int i=1; i<=3; i++){
            do{
                System.out.println("Enter marks between 50 and 100 for course "+i);
                prereqMark = input.nextDouble();
                sum  += prereqMark;
            }while(prereqMark<50 || prereqMark>100);
        }
        // processing details
        avgScore = sum/3;
        age = currentYear - bornYear;
        if (age<21)
            older_21=false;

        // Show Result
        System.out.println("My Details");
        System.out.println("----------");
        System.out.print("Name : "+name);
        System.out.print("  Hobby: "+hobby);
        System.out.println();
        System.out.println("Year of Birth: "+bornYear);
        System.out.printf("Average score: %.1f", avgScore);
        System.out.println();
        if (older_21)
            System.out.println("Yes you are enrolled!");
        else
            System.out.println("Sorry you are not 21!");
        
    }

}
