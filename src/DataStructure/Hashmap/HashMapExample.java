package DataStructure.Hashmap;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // does not allow duplicate keys
        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 10000);
        phonebook.put("Neil", 16789);
        phonebook.put("Duk", 13013);
        System.out.println(phonebook);
        if (phonebook.containsKey("Kevin")){
            phonebook.remove("Kevin");
        }
        System.out.println(phonebook);
        phonebook.clear();
        System.out.println(phonebook);
    }
}
