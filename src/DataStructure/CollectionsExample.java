package DataStructure;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class CollectionsExample {
        public static void main(String[] args){
            List<Integer> mylist = Arrays.asList(1,1,3,4,5,8,1,2);
            System.out.println("Index of 3 is: "+
                    Collections.binarySearch(mylist, 3));
    }
}
