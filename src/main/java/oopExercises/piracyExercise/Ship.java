package oopExercises.piracyExercise;

public class Ship {
     double draft;
     int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }
    public boolean isWorthIt() {
        double adjustedDraft = draft - (crew * 1.5);
        return adjustedDraft > 20;
    }
}



