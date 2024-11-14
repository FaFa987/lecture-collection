package se.lexicon;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        ex1();

    }
    public static void ex1() {
        HashMap<String, String > contacts = new HashMap<>();
        contacts.put("John", "Will@yahoo.com");
        contacts.put("Jane", "Doe@yahoo.com");

        System.out.println(contacts.get("John"));
        System.out.println(contacts.containsValue("Doe@yahoo"));
        System.out.println(contacts.containsKey("Jane"));


    }
}
