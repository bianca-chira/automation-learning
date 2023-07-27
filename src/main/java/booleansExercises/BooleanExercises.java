package booleansExercises;

public class BooleanExercises {

    public static Boolean isExpressionTrue(){
    boolean greenLight = true;
    boolean pedestrian = false;
    boolean rightTurn = true;
    boolean otherLane = false;

    return ((rightTurn && !pedestrian) || otherLane) ||(rightTurn && !pedestrian && greenLight);

    }
}
