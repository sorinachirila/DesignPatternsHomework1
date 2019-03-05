package structural.decorator.homework.option;

import structural.decorator.homework.car.Car;

public class LeatherSeats extends CarDecorator {

    private static final double LEATHER_SEATS_COST = 4000d;

    private Car car;

    public LeatherSeats(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Leather Seats";
    }

    public double getCost() {
        return car.getCost() + LEATHER_SEATS_COST;
    }


}
