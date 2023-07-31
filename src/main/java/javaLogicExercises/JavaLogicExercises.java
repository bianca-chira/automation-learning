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
        if (candy >= 5) {
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

    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }

        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }

        return Math.max(a, b);
    }

    public static int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) {
            return 10;
        } else if ((a + b) - (b + c) == 10 || (a + b) - (a + c) == 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0; // No table
        } else if (you >= 8 || date >= 8) {
            return 2; // Yes, table
        } else {
            return 1; // Maybe, table
        }
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return (n <= 1 || n >= 10);
        } else {
            return (n >= 1 && n <= 10);
        }
    }

    public static boolean old35(int n) {
        boolean isMultipleOf3 = n % 3 == 0;
        boolean isMultipleOf5 = n % 5 == 0;

        return (isMultipleOf3 || isMultipleOf5) && !(isMultipleOf3 && isMultipleOf5);
    }

    public static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }

    }

    public static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return (b > a) && (c > b);
        }
    }

    public static boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == b && b == c) {
            if (a == 2) {
                return 10;
            } else {
                return 5;
            }
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean shareDigit(int a, int b) {
        int a1 = a / 10;
        int a2 = a % 10;
        int b1 = b / 10;
        int b2 = b % 10;
        return (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2);
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }


    public static String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day == 0 || day == 6) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }

    public static boolean specialEleven(int n) {
        return (n % 11 == 0) || (n % 11 == 1);
    }

    public static boolean less20(int n) {
        return (n % 20 == 18) || (n % 20 == 19);
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            return isMom;
        }
        return true;
    }

    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    public  static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return (a <= b && b <= c);
        } else {
            return (a < b && b < c);
        }
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            die1 = (die1 % 6) + 1;
        }
        return die1 + die2;
    }

    public  static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public  static int sumLimit(int a, int b) {
        String aString = String.valueOf(a);
        String sumString = String.valueOf(a + b);
        if (sumString.length() == aString.length()) {
            return a + b;
        } else {
            return a;
        }
    }


}


