package stringExercises;

public class StringExercises {

    //helloName
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    //makeOutWord
    public static String makeOutWord(String out, String word) {
        String firstWord = out.substring(0,2);
        String endWord = out.substring(2);
        return firstWord + word + endWord;
    }

    public static String firstHalf(String str) {
        int word = str.length() / 2;
        return str.substring(0, word);


    }

}
