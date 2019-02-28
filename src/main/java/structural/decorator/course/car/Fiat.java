package structural.decorator.course.car;

public class Fiat extends Car {

    private static final double FIAT_COST = 19547d;

    public Fiat() {
        description = "This is FIAT car brand";
    }

    public double getCost() {
        return FIAT_COST;
    }
}
