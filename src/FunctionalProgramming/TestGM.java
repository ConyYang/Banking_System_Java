package FunctionalProgramming;

public class TestGM {
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello "+name);
            }
        }; //gm

        gm.greet("Cony");

        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello" + name);
        };
        gm.greet("Cony2");

    }
}
