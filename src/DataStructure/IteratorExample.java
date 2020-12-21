package DataStructure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main (String[] args){
        Collection myCollection = Arrays.asList("red", "orange",
                "yellow", "green", "blue", "indigo", "violet");
        Iterator myIterator = myCollection.iterator();
        while (myIterator.hasNext())
        {
            System.out.println(myIterator.next());
        }
    }
}


