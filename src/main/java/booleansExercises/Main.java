package booleansExercises;

public class Main {
    public static void main(String[] args) {
        //Consider the following lines of code:
        //boolean greenLight = true;
        //boolean pedestrian = false;
        //boolean rightTurn = true;
        //boolean otherLane = false;
        //You can go ahead only if the following expression evaluates to 'true' :
        //(( (rightTurn && !pedestrian || otherLane) || ( ? && !pedestrian && greenLight ) ) == true )
        //What variables can you put in place of '?' so that you can go ahead?
        System.out.println(BooleanExercises.isExpressionTrue());
    }
}
