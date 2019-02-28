package structural.decorator.course.car;

public abstract class Car {

    protected String description = "Unknown car type";

    public abstract double getCost();

    public String getDescription() {
        return description;
    }
}
