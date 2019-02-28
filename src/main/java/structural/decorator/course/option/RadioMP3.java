package structural.decorator.course.option;

import structural.decorator.course.car.Car;

public class RadioMP3 extends CarDecorator {

    private static final double RADIOMP3_COST = 500d;

    private Car car;

    public RadioMP3(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + ", Radio MP3";
    }

    public double getCost() {
        return car.getCost() + RADIOMP3_COST;
    }
}
