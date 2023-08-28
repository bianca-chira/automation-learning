package oopExercises.carpetCostCalculator;

public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
