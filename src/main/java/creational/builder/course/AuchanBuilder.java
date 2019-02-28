package creational.builder.course;

public class AuchanBuilder extends ShopBuilder {
    public void buildRoof() {
        shop.setRoof("Metigla");
    }

    public void buildFloor() {
        shop.setFloor("Ceramiche Serra");
    }

    public void buildWalls() {
        shop.setWalls("MACON");
    }
}
