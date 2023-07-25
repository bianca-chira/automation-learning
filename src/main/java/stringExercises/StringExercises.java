package stringExercises;

public class StringExercises {

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeOutWord(String out, String word) {
        String firstWord = out.substring(0, 2);
        String endWord = out.substring(2);
        return firstWord + word + endWord;
    }

    public static String firstHalf(String str) {
        int halfWord = str.length() / 2;
        return str.substring(0, halfWord);

    }

    public static String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }

    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public static boolean endsLy(String str) {
        return str.endsWith("ly");

    }

    public static String middleThree(String str) {
        int numberChar = str.length();
        int middle = numberChar / 2;
        return str.substring(middle - 1, middle +2);

    }

    public static String lastChars(String a, String b) {
        String first;
        String last;
        if (a.length() > 0){
            first = a.substring(0,1);
        }
        else{
            first = "@";
        }
        if (b.length() > 0){
            last = b.substring(b.length()-1);
        }else{
            last = "@";
        }
        return first + last;

    }

    public static String seeColor(String str) {
        if(str.startsWith("red")){
            return "red";
        }
        else if(str.startsWith("blue")){
            return "blue";
        }
        else{
            return "";
        }

    }

    public static String extraFront(String str) {

        if(str.length() >= 2){
            String twoCh = str.substring(0,2);
            return twoCh + twoCh +twoCh;
        }
        else{
            return str + str +str;
        }
    }
    public static String startWord(String str, String word) {
        if(str.length() >= word.length() && str.substring(1,word.length()).equals(word.substring(1))){
            return str.substring(0, word.length());
        }
        else{
            return "";
        }
    }

    public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public static String extraEnd(String str) {
        return str.substring(str.length()-2) + str.substring(str.length()-2)+str.substring(str.length()-2);
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String left2(String str) {
        return str.substring(2) + str.substring(0,2);
    }

    public static String withouEnd2(String str) {
        if(str.length() > 1){
            return str.substring(1, str.length()-1);
        }
        else{
            return "";
        }
    }

    public static boolean hasBad(String str) {
        return str.startsWith("bad") || str.length() >= 4 && str.startsWith("bad", 1);
    }


    public static String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length()- n);
    }

    public static String conCat(String a, String b) {
        if(a.length()>0 && b.length()>0 && a.substring(a.length() -1).equals(b.substring(0,1))) {
            return a + b.substring(1);
        }
        else {
            return a + b;
        }
    }

    public static boolean frontAgain(String str) {
        return str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2));

    }
}
