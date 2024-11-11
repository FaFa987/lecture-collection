package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;

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
        numbers.add(700);
        numbers.add(500);
        System.out.println(numbers);
    }

}