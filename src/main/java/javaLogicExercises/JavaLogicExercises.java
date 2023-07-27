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



}
