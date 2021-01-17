package FunctionalProgramming;
// A functional interface is an interface that has only one abstract method

// this is an annotation
@FunctionalInterface
public interface GreetingMessage {
    public abstract void greet(String name);
}
