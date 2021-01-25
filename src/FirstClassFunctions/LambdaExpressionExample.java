package FirstClassFunctions;
import java.util.function.Function;


public class LambdaExpressionExample {
     // warp themulti lines function in {} and add return statement at last line
     public static void main(String[] args) {
         Function<Integer, Integer> absoluteValue =
                 (x)-> {if (x<0) {return -x;} else {return x;}};
         int result = absoluteValue.apply(-100);
         System.out.println(result);
     }
}
