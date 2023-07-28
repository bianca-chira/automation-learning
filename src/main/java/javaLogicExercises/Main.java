package javaLogicExercises;

public class Main {

    public static void main(String[] args) {
        //When squirrels get together for a party, they like to have cigars.
        // A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars.
        // Return true if the party with the given values is successful, or false otherwise.
        System.out.println(JavaLogicExercises.cigarParty(30,false));
        System.out.println(JavaLogicExercises.cigarParty(50,false));
        System.out.println(JavaLogicExercises.cigarParty(70,true));



        //You are driving a little too fast, and a police officer stops you.
        // Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
        // If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
        // If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
        System.out.println(JavaLogicExercises.caughtSpeeding(60,false));
        System.out.println(JavaLogicExercises.caughtSpeeding(65,false));
        System.out.println(JavaLogicExercises.caughtSpeeding(60,true));


        //The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
        System.out.println(JavaLogicExercises.love6(6,4));
        System.out.println(JavaLogicExercises.love6(5,4));
        System.out.println(JavaLogicExercises.love6(1,5));

        //Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
        System.out.println(JavaLogicExercises.more20(20));
        System.out.println(JavaLogicExercises.more20(21));
        System.out.println(JavaLogicExercises.more20(22));

        //Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2
        System.out.println(JavaLogicExercises.nearTen(12));
        System.out.println(JavaLogicExercises.nearTen(17));
        System.out.println(JavaLogicExercises.nearTen(19));


        //We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0)
        System.out.println(JavaLogicExercises.teaParty(6,8));
        System.out.println(JavaLogicExercises.teaParty(3,8));
        System.out.println(JavaLogicExercises.teaParty(20,6));

        //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
        System.out.println(JavaLogicExercises.twoAsOne(1,2,3));
        System.out.println(JavaLogicExercises.twoAsOne(3,1,2));
        System.out.println(JavaLogicExercises.twoAsOne(4,2,3));


        //Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
        System.out.println(JavaLogicExercises.lastDigit(23,19,13));
        System.out.println(JavaLogicExercises.lastDigit(23,19,12));
        System.out.println(JavaLogicExercises.lastDigit(23,19,3));

        //Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
        System.out.println(JavaLogicExercises.maxMod5(2,3));
        System.out.println(JavaLogicExercises.maxMod5(6,2));
        System.out.println(JavaLogicExercises.maxMod5(3,2));
    }
}
