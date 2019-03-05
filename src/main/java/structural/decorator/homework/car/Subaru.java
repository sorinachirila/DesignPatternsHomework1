package structural.decorator.homework.car;

public class Subaru extends Car {

    private static final double SUBARU_COST = 24295d;

    public Subaru() {
        description = "This is SUBARU car brand";
    }

    public double getCost() {
        return SUBARU_COST;
    }
}
