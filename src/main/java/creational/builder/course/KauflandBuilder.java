package creational.builder.course;

public class KauflandBuilder extends ShopBuilder {
    public void buildRoof() {
        shop.setRoof("Bilka");
    }

    public void buildFloor() {
        shop.setFloor("Euroceramic");
    }

    public void buildWalls() {
        shop.setWalls("MACON");
    }
}
