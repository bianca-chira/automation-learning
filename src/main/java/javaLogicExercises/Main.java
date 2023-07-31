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


        //You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
        System.out.println(JavaLogicExercises.blueTicket(9,1,0));
        System.out.println(JavaLogicExercises.blueTicket(9,2,0));
        System.out.println(JavaLogicExercises.blueTicket(6,1,4));

        //You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
        System.out.println(JavaLogicExercises.dateFashion(5,10));
        System.out.println(JavaLogicExercises.dateFashion(5,2));
        System.out.println(JavaLogicExercises.dateFashion(5,5));


       //Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
        System.out.println(JavaLogicExercises.sortaSum(3,4));
        System.out.println(JavaLogicExercises.sortaSum(9,4));
        System.out.println(JavaLogicExercises.sortaSum(10,11));

        //Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
        System.out.println(JavaLogicExercises.in1To10(5, false));
        System.out.println(JavaLogicExercises.in1To10(11, false));
        System.out.println(JavaLogicExercises.in1To10(5, true));


        //Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator
        System.out.println(JavaLogicExercises.old35(3));
        System.out.println(JavaLogicExercises.old35(15));
        System.out.println(JavaLogicExercises.old35(10));

        //Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
        System.out.println(JavaLogicExercises.teenSum(3,4));
        System.out.println(JavaLogicExercises.teenSum(10,13));
        System.out.println(JavaLogicExercises.teenSum(13,2));

        //Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged
        System.out.println(JavaLogicExercises.fizzString("fig"));
        System.out.println(JavaLogicExercises.fizzString("dib"));
        System.out.println(JavaLogicExercises.fizzString("fib"));

        //Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.
        System.out.println(JavaLogicExercises.inOrder(1,2,4,false));
        System.out.println(JavaLogicExercises.inOrder(1,2,1,false));
        System.out.println(JavaLogicExercises.inOrder(1,1,2,true));


        //Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
        System.out.println(JavaLogicExercises.lessBy10(1,7,11));
        System.out.println(JavaLogicExercises.lessBy10(1,7,10));
        System.out.println(JavaLogicExercises.lessBy10(11,1,7));


        //You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
        System.out.println(JavaLogicExercises.redTicket(2,2,2));
        System.out.println(JavaLogicExercises.redTicket(2,2,1));
        System.out.println(JavaLogicExercises.redTicket(0,0,0));


        //Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
        System.out.println(JavaLogicExercises.shareDigit(12,23));
        System.out.println(JavaLogicExercises.shareDigit(12,43));
        System.out.println(JavaLogicExercises.shareDigit(12,44));


        //The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
        System.out.println(JavaLogicExercises.squirrelPlay(70, false));
        System.out.println(JavaLogicExercises.squirrelPlay(95, false));
        System.out.println(JavaLogicExercises.squirrelPlay(95, true));


        //Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off"
        System.out.println(JavaLogicExercises.alarmClock(1,false));
        System.out.println(JavaLogicExercises.alarmClock(5,false));
        System.out.println(JavaLogicExercises.alarmClock(0,false));


       // We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator
        System.out.println(JavaLogicExercises.specialEleven(22));
        System.out.println(JavaLogicExercises.specialEleven(23));
        System.out.println(JavaLogicExercises.specialEleven(24));


        //Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.
        System.out.println(JavaLogicExercises.less20(19));
        System.out.println(JavaLogicExercises.less20(18));
        System.out.println(JavaLogicExercises.less20(20));


        //Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.
        System.out.println(JavaLogicExercises.answerCell(false,false,false));
        System.out.println(JavaLogicExercises.answerCell(false,false,true));
        System.out.println(JavaLogicExercises.answerCell(true,false,false));


        //Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?
        System.out.println(JavaLogicExercises.fizzString2(1));
        System.out.println(JavaLogicExercises.fizzString2(2));
        System.out.println(JavaLogicExercises.fizzString2(3));

        //Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
        System.out.println(JavaLogicExercises.inOrderEqual(2,5,11,false));
        System.out.println(JavaLogicExercises.inOrderEqual(5,7,6,false));
        System.out.println(JavaLogicExercises.inOrderEqual(5,5,7,true));


        //Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
        System.out.println(JavaLogicExercises.withoutDoubles(2,3,true));
        System.out.println(JavaLogicExercises.withoutDoubles(3,3,true));
        System.out.println(JavaLogicExercises.withoutDoubles(3,3,false));

        //You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
        System.out.println(JavaLogicExercises.greenTicket(1,2,3));
        System.out.println(JavaLogicExercises.greenTicket(2,2,2));
        System.out.println(JavaLogicExercises.greenTicket(1,1,2));


        //Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
        System.out.println(JavaLogicExercises.sumLimit(2,3));
        System.out.println(JavaLogicExercises.sumLimit(8,3));
        System.out.println(JavaLogicExercises.sumLimit(8,1));


    }
}
