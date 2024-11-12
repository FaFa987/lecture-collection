package se.lexicon;

import se.lexicon.model.Person;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ex6();

    }

    public static void ex0(){
        char[] letters = {'J','A','V','A'};
        System.out.println(Arrays.toString(letters));
        letters = addChar('!',letters);
        System.out.println(Arrays.toString(letters));
    }
    private static char[] addChar(char letter, char[] array){
        int newLength = array.length;
        var newArray =Arrays.copyOf(array, newLength+1); //var (char[])
        newArray[newLength] = letter;
        return newArray;
    }

    public static void ex1(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(300);
        numbers.add(200);
        numbers.add(100);
        numbers.add(500);
        System.out.println(numbers);
        System.out.println("numbers.size() = " + numbers.size());

        System.out.println("Accese Element with index 1 : " + numbers.get(0));
        System.out.println("Accese Element with index 3 : " + numbers.get(3));
        //System.out.println("Accese Element with index 5 : " + numbers.get(5));

        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("----- modify or delete -----");
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number == 300){
                iterator.remove();
            } else {
                System.out.println(numbers);
            }
        }

        System.out.println("-----for print out, not modify -----");
        for (Integer number : numbers) {
            if (number == 200){
                System.out.println(number);
            }
            System.out.println(number);
        }

    }
    public static void ex2(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(300);
        numbers.add(200);
        numbers.add(100);
        numbers.add(500);

        //Integer isRemoved = numbers.remove(3);
        boolean isRemoved = numbers.remove(Integer.valueOf(502));
        System.out.println(isRemoved);
        System.out.println(numbers);

        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(a));

        System.out.println("------print with Enhanced for loop-------");
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println("------print with Index based for loop-------");
        for(int i = 0 ; i < numbers.size() ; i++){
            System.out.println(numbers.get(1));
        }
    }

    public static void ex3(){
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Benz");

        List<String> cars2 = new ArrayList<>();
        cars.add("Volvo");
        cars.add("hyundai");

        cars.addAll(cars2);

        System.out.println(cars);
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("cars.indexOf(\"Toyota\") = " + cars.indexOf("Toyota"));
        System.out.println("cars = " + cars.lastIndexOf("Volvo"));
        System.out.println("cars = " + cars.indexOf(2));

    }
    public static void ex4(){
        List<String> originList = new ArrayList<>();
        originList.add("C");
        originList.add("B");
        originList.add("a");
        originList.add("A");
        originList.add("D");

        List<String> referenceList = originList;
        System.out.println(referenceList);
        originList.remove(0);
        //ArrayList<String> copyList = originList.clone

        System.out.println("referenceList.size() = " + referenceList.size());
        System.out.println("originList = " + originList.size());
    }
    public static void ex5(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(4);

        //numbers.sort(null);
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);

        List<String> letters = new ArrayList<>();
        letters.add("C");
        letters.add("B");
        letters.add("a");
        letters.add("A");
        letters.add("D");
        //letters.sort(Collections.reverseOrder());
        Collections.sort(letters);
        System.out.println(letters);

    }
    public static void ex6(){
        String test1 = "Test";
        String test2 = "Test";
        boolean compareSring = test1.equals(test2);
        System.out.println("compareSring = " + compareSring);

        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());
        System.out.println("test".hashCode());
        System.out.println("TEST".hashCode());
        System.out.println("Test".hashCode());

        Person p1 = new Person(1, "Fafa", "kh", "fafa@gmail");
        Person p2 = new Person(1, "Fafa", "kh", "fafa@gmail");
        boolean isEqual = p1.equals(p2);
        System.out.println("isEqual = " + isEqual);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }


}