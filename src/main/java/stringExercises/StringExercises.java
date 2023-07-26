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
        } else{
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
        } else if(str.startsWith("blue")){
            return "blue";
        } else{
            return "";
        }

    }

    public static String extraFront(String str) {

        if(str.length() >= 2){
            String twoCh = str.substring(0,2);
            return twoCh + twoCh +twoCh;
        } else{
            return str + str +str;
        }
    }
    public static String startWord(String str, String word) {
        if(str.length() >= word.length() && str.substring(1,word.length()).equals(word.substring(1))){
            return str.substring(0, word.length());
        } else{
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
        if (str.length() <= 1) {
            return "";
        } else {
            return str.substring(1, str.length()-1);
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
        } else {
            return a + b;
        }
    }

    public static boolean frontAgain(String str) {
        return str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

    public static String without2(String str) {
        if(str.length()>=2 && str.substring(0, 2).equals(str.substring(str.length() - 2))){
            return str.substring(2);
        } else{
            return str;
        }
    }

    public static String withoutX(String str) {
        if(str.startsWith("x")) {
            str = str.substring(1);
        }
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" +word + "</"+tag+">";
    }

    public static String firstTwo(String str) {
        if(str.length() >2){
            return str.substring(0,2);
        }else{
            return str;
        }
    }

    public static String comboString(String a, String b) {
        if(a.length()>b.length()){
            return b+a+b;
        }else{
            return a+b+a;
        }
    }

    public static String right2(String str) {
        if(str.length()>=2){
            return str.substring(str.length()-2) + str.substring(0,str.length()-2);
        }else{
            return str;
        }
    }

    public  static String middleTwo(String str) {
        int middle = str.length()/2;
        return str.substring(middle -1, middle+1);
    }

    public static String twoChar(String str, int index) {
        if (index+2>str.length() || index <0){
            return str.substring(0,2);

        }else{
            return str.substring(index, index+2);
        }
    }

    public static String atFirst(String str) {
        if (str.length() < 2) {
            if (str.length() == 0) {
                return "@@";
            } else {
                return str + "@";
            }
        }
        return str.substring(0, 2);
    }

    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            char lastChar = str.charAt(str.length() - 1);
            char secondLastChar = str.charAt(str.length() - 2);
            return str.substring(0, str.length() - 2) + lastChar + secondLastChar;
        }
    }

    public static String minCat(String a, String b) {
        if(a.length() > b.length())
        {
            return a.substring(a.length()-b.length()) + b;
        } else {
            return a + b.substring(b.length() - a.length());
        }
    }

    public static String deFront(String str) {
        if (str.length() < 2) {
            return str;
        }
        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        if (firstChar == 'a' && secondChar == 'b') {
            return str;
        } else if (firstChar == 'a') {
            return firstChar + str.substring(2);
        } else if (secondChar == 'b') {
            return str.substring(1);
        } else {
            return str.substring(2);
        }
    }

    public static String withoutX2(String str) {
        if (str.length() >= 2) {
            if (str.startsWith("xx")) {
                return str.substring(2);
            } else if (str.startsWith("x")) {
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            }
        } else if (str.length() == 1 && str.startsWith("x")) {
            return "";
        }

        return str;
    }



}
