import java.util.Scanner;

public class ScannerTest {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Integer");
        int a = scanner.nextInt();
        System.out.println(a);

        System.out.println("Enter a Char");
        char c = scanner.next().charAt(0);
        System.out.println(c);
    }
}
