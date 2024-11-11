package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ex1();

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

}