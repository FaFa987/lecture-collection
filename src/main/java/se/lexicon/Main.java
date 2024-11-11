package se.lexicon;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ex0();

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
}