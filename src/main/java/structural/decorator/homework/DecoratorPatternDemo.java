package structural.decorator.homework;

import structural.decorator.homework.car.Car;
import structural.decorator.homework.car.Fiat;
import structural.decorator.homework.car.Mercedes;
import structural.decorator.homework.car.Subaru;
import structural.decorator.homework.option.Climatronic;
import structural.decorator.homework.option.LEDHeadlights;
import structural.decorator.homework.option.LeatherSeats;
import structural.decorator.homework.option.RadioMP3;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        //Mercedes
        Car mercedes = new Mercedes();
        System.out.println(mercedes.getDescription() + " €" + mercedes.getCost());

        //apply decorator
        //Fiat
        Car fiat = new Fiat();
        fiat = new RadioMP3(fiat);
        fiat = new LeatherSeats(fiat);
        System.out.println(fiat.getDescription() + " €" + fiat.getCost());

        //Subaru
        Car subaru = new Subaru();
        subaru = new Climatronic(subaru);
        subaru = new LeatherSeats(subaru);
        subaru = new LEDHeadlights(subaru);
        subaru = new RadioMP3(subaru);
        System.out.println(subaru.getDescription() + " €" + subaru.getCost());
    }
}
