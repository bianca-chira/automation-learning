package stringExercises;

public class Main {

    public static void main(String[] args) {

        //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        //helloName("Bob") → "Hello Bob!"
        System.out.println(StringExercises.helloName("Bob"));

        //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
        //makeOutWord("<<>>", "Yay") → "<<Yay>>"
        System.out.println(StringExercises.makeOutWord("<<>>", "Yay"));

        //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
        System.out.println(StringExercises.firstHalf("WooHoo"));




    }
}
