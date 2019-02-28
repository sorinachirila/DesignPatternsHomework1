package creational.builder.course;

public class CarrefourBuilder extends ShopBuilder {
    public void buildRoof() {
        shop.setRoof("Bilka");
    }

    public void buildFloor() {
        shop.setFloor("Ceramica Gomez");
    }

    public void buildWalls() {
        shop.setWalls("MACON");
    }
}
