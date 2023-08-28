package oopExercises.pointExercise;
//https://deloittedevelopment.udemy.com/course/java-the-complete-java-developer-course/learn/quiz/4590568#overview

public class Point {
    int x;
    int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;

    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }
}
