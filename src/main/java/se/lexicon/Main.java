package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ex3();

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


}