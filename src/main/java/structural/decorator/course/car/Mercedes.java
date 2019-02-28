package structural.decorator.course.car;

public class Mercedes extends Car {

    private static final double MERCEDES_COST = 26037d;

    public Mercedes() {
        description = "This is MERCEDES-BENZ car brand";
    }

    public double getCost() {
        return MERCEDES_COST;
    }
}
