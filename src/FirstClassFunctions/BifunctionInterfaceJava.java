package FirstClassFunctions;
import java.util.function.BiFunction;

public class BifunctionInterfaceJava {
    // function take 2 arguments instead of one
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y)->x+y;
        System.out.println(add.apply(1, 2));


        Trifunction<Integer, Integer,Integer, Integer> triadd;
        triadd = (a,b,c)->a+b+c;
        System.out.println((triadd.apply(1,3,4)));

        NoArgFunction<String> sayhello = ()->"Hello";
        System.out.println(sayhello.apply());

    }
}
