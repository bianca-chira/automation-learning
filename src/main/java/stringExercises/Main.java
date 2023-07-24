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

        //Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
        //nonStart("Hello", "There") → "ellohere"
        System.out.println(StringExercises.nonStart("Hello", "There"));

        //Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
        //theEnd("Hello", true) → "H"
        System.out.println(StringExercises.theEnd("Hello",true));
        System.out.println(StringExercises.theEnd("Hello", false));

        //Given a string, return true if it ends in "ly".
        System.out.println(StringExercises.endsLy("oddly"));
        System.out.println(StringExercises.endsLy("Hello"));

        //Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
        System.out.println(StringExercises.middleThree("Candy"));

        //Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
        System.out.println(StringExercises.lastChars("last", "chars"));
        System.out.println(StringExercises.lastChars("last", ""));
        System.out.println(StringExercises.lastChars("", "chars"));
        System.out.println(StringExercises.lastChars("", ""));


        //Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
        System.out.println(StringExercises.seeColor("redxxsj"));
        System.out.println(StringExercises.seeColor("blueiosa"));
        System.out.println(StringExercises.seeColor("asredxx"));
        System.out.println(StringExercises.seeColor("asblue"));


        //Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
        System.out.println(StringExercises.extraFront("Hello"));
        System.out.println(StringExercises.extraFront("H"));
        System.out.println(StringExercises.extraFront("ab"));

    }
}
