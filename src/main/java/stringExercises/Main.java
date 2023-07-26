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


        //Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
        //startWord("hippo", "hi") → "hi"
        System.out.println(StringExercises.startWord("hippo", "hi"));
        System.out.println(StringExercises.startWord("hippo", "xip"));
        System.out.println(StringExercises.startWord("hippo", "i"));

        //Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
        //makeAbba("Hi", "Bye") → "HiByeByeHi"
        System.out.println(StringExercises.makeAbba("Hy", "Bye"));


        //Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
        System.out.println(StringExercises.extraEnd("Hello"));


        //Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
        System.out.println(StringExercises.withoutEnd("Hello"));


        //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2
        System.out.println(StringExercises.left2("Hello"));


        //Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
        System.out.println(StringExercises.withouEnd2("Hello"));
        System.out.println(StringExercises.withouEnd2("abc"));


        //Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
        System.out.println(StringExercises.hasBad("badxx"));
        System.out.println(StringExercises.hasBad("xbadxx"));
        System.out.println(StringExercises.hasBad("xxxbadxx"));
        System.out.println(StringExercises.hasBad(""));


        //Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
        System.out.println(StringExercises.nTwice("Hello", 2));
        System.out.println(StringExercises.nTwice("Chocolate", 3));
        System.out.println(StringExercises.nTwice("Chocolate", 1));


        //Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
        System.out.println(StringExercises.conCat("abc","cat"));
        System.out.println(StringExercises.conCat("dog","cat"));
        System.out.println(StringExercises.conCat("","cat"));

        //Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
        System.out.println(StringExercises.frontAgain("edited"));
        System.out.println(StringExercises.frontAgain("edit"));
        System.out.println(StringExercises.frontAgain("ed"));


        //Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
        System.out.println(StringExercises.without2("HelloHe"));
        System.out.println(StringExercises.without2("HelloHi"));
        System.out.println(StringExercises.without2("Hi"));

        //Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
        System.out.println(StringExercises.withoutX("xHix"));
        System.out.println(StringExercises.withoutX("Hix"));
        System.out.println(StringExercises.withoutX("Hxix"));


        //The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
        System.out.println(StringExercises.makeTags("i","Yay"));
        System.out.println(StringExercises.makeTags("i","Hello"));
        System.out.println(StringExercises.makeTags("cite","Yay"));


        //Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
        System.out.println(StringExercises.firstTwo("Hello"));
        System.out.println(StringExercises.firstTwo("abcdefg"));
        System.out.println(StringExercises.firstTwo("ab"));

        //Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
        System.out.println(StringExercises.comboString("Hello","Hi"));
        System.out.println(StringExercises.comboString("hi","Hello"));
        System.out.println(StringExercises.comboString("aaa","b"));

        //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
        System.out.println(StringExercises.right2("Hello"));
        System.out.println(StringExercises.right2("Hi"));
        System.out.println(StringExercises.right2("Java"));


        //Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
        System.out.println(StringExercises.middleTwo("string"));
        System.out.println(StringExercises.middleTwo("code"));
        System.out.println(StringExercises.middleTwo("Practice"));


        //Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
        System.out.println(StringExercises.twoChar("java",0));
        System.out.println(StringExercises.twoChar("java",2));
        System.out.println(StringExercises.twoChar("java",3));


        //Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
        System.out.println(StringExercises.atFirst("hello"));
        System.out.println(StringExercises.atFirst("hi"));
        System.out.println(StringExercises.atFirst("h"));


        //Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
        System.out.println(StringExercises.lastTwo("coding"));
        System.out.println(StringExercises.lastTwo("cat"));
        System.out.println(StringExercises.lastTwo("ab"));

        //Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
        System.out.println(StringExercises.minCat("Hello", "Hi"));
        System.out.println(StringExercises.minCat("java", "Hello"));


       //Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
        System.out.println(StringExercises.deFront("Hello"));
        System.out.println(StringExercises.deFront("java"));
        System.out.println(StringExercises.deFront("abc"));


        //Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
        System.out.println(StringExercises.withoutX2("xHi"));
        System.out.println(StringExercises.withoutX2("Hxi"));
        System.out.println(StringExercises.withoutX2("Hi"));
    }
}
