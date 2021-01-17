package DataStructure.Hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LInkedHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f, true);
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 10000);
        phonebook.put("Neil", 16789);
        phonebook.put("Duk", 13013);
        System.out.println("Kevin's number is :"+phonebook.get("Kevin"));

        System.out.println("\nList of contacts in phonebook: ");
        for (Map.Entry<String, Integer> entry: phonebook.entrySet()){
            System.out.println(entry.getKey() + ": "+entry.getValue());
        }//end for
    }// end psvm
}
