package se.lexicon;

import se.lexicon.model.Person;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        ex2();

    }

public static void ex1(){

        //HashSet<String> countries = new HashSet<>();
        TreeSet<String> countries = new TreeSet<>();

        countries.add("China");
        countries.add("Iran");
        countries.add("France");
        countries.add("China");
        countries.add("Italy");
        System.out.println(countries);
    }

    public static void ex2(){

        HashSet<Person> people = new HashSet<>();
        people.add( new Person(2,"Simon","Lin" ,"simon@gmail.com" ));
        people.add( new Person(1,"Jane","Kim" ,"jane@gmail.com" ));
        people.add( new Person(3,"Michael","Lin" ,"michael@gmail.com" ));
        people.add( new Person(3,"Michael","Lin" ,"michael@gmail.com" ));
        //person.add("Jane");
        //person.add("Michael");
        System.out.println(people.size());

    }
}
