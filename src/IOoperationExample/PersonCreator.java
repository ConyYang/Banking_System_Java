package IOoperationExample;

import java.util.Scanner;

public class PersonCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.next();
        System.out.println("Enter a age: ");
        int age = scanner.nextInt();
        System.out.println("Enter a phone number: ");
        long phonenumber = scanner.nextLong();

        Person aperson = new Person(name, age, phonenumber);

    }
}
