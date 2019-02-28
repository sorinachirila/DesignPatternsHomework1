package structural.decorator.course.option;

import structural.decorator.course.car.Car;

public class Climatronic extends CarDecorator {

    private static final double CLIMATRONIC_COST = 1000d;

    private Car car;

    public Climatronic(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Climatronic";
    }

    public double getCost() {
        return car.getCost() + CLIMATRONIC_COST;
    }

}
