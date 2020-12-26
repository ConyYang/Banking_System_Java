package DataStructure;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack mystack = new Stack();
        for (int i = 1; i < 10; i++) {
            mystack.push(i);
        }
        while (!mystack.empty()){
            System.out.println(mystack.pop());
            System.out.println(",");
        }
        System.out.println("LIFT OFF");
    }
}
