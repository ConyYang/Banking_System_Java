package FirstClassFunctions;

import java.util.function.Function;

// Java provides function interface that we can define functions as varqaibles
public class FunctionInterfaceExample {
    protected static class MyMath{
        public static Integer triple(Integer X){
            return X*3;
        } // triple
    } // MyMath

    public static void main(String[] args) {
        //this double colon thing here is how we refer to an object or classes method
        // as an object of type function, instead of just using a dot
//        T - the type of the input to the function
//        R - the type of the result of the function
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
