package creational.builder.course;

public abstract class ShopBuilder {
    protected Shop shop;

    public abstract void buildRoof();

    public abstract void buildFloor();

    public abstract void buildWalls();

    public void createNewShop() {
        shop = new Shop();
    }

    public Shop getShop() {
        return shop;
    }


}
