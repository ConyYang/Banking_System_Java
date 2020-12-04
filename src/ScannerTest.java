import java.util.Scanner;

public class ScannerTest {
    public static void main (String[] args){
        System.out.println(13%3);
        int countdown =10;
        int j=1;
        do{
            System.out.println("Hello"+j);
            countdown--;
            j=j+2;
        }while (countdown>3);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Integer");
        int a = scanner.nextInt();
        System.out.println(a);

        System.out.println("Enter a Char");
        char c = scanner.next().charAt(0);
        System.out.println(c);

    }
}
