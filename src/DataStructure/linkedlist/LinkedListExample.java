package DataStructure.linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList provinces = new LinkedList();
        provinces.add("Tibet");
        provinces.add("GuangZhou");
        provinces.add("Sichuan");
        provinces.add("Yunnan");
        provinces.add("Nanjing");
        System.out.println("Initial provinces are: " + provinces);

        provinces.addFirst("Chongqing");
        System.out.println("Modified provinces are: "+provinces);
        System.out.println("The last province in my linkedlist is: "+provinces.getLast());

        ListIterator iterator = provinces.listIterator(provinces.size());
        System.out.println("Now we sort from back to start: ");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }


    }
}
