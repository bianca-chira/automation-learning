package javaLogicExercises;

public class JavaLogicExercises {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (cigars >= 40 && cigars <= 60) || isWeekend && cigars > 60;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else {
            return 2;
        }
    }

    public static boolean love6(int a, int b) {
        return a == 6 || b == 6 || a + b == 6 || a - b == 6 || b - a == 6;
    }

    public static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= 5 && candy >= 5) {
            if (tea >= 2 * candy || candy >= 2 * tea) {
                return 2;
            } else {
                return 1;
            }
        }

        return 0;
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public  static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }

        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }

        return Math.max(a, b);
    }


}
