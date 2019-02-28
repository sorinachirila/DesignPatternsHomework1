package structural.decorator.course.option;

import structural.decorator.course.car.Car;

public class LEDHeadlights extends CarDecorator {

    private static final double LEDHEADLIGHTS_COST = 1500d;

    private Car car;

    public LEDHeadlights(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", LED Headlights";
    }

    public double getCost() {
        return car.getCost() + LEDHEADLIGHTS_COST;
    }
}
