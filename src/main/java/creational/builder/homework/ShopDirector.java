package creational.builder.homework;

public class ShopDirector {
    private ShopBuilder shopBuilder;

    public void setShopBuilder(ShopBuilder shopBuilder){
        this.shopBuilder = shopBuilder;
    }

    public Shop getShop(){
        return shopBuilder.getShop();
    }

    public void constructShop(){
        shopBuilder.createNewShop();
         shopBuilder.buildFloor();
         shopBuilder.buildWalls();
         shopBuilder.buildRoof();
    }
}
