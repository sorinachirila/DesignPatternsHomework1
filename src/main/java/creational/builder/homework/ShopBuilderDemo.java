package creational.builder.homework;

public class ShopBuilderDemo {
    public static void main(String[] args) {

        //director comes to see specifications for building a NEW shop
        ShopDirector shopDirector = new ShopDirector();
        //director takes the concrete specifications
        ShopBuilder kaufland = new KauflandBuilder();
        shopDirector.setShopBuilder(kaufland);
        //director builds the ACTUAL shop
        shopDirector.constructShop();
        //director "delivers" FINAL shop
        Shop shop = shopDirector.getShop();
        System.out.println(shop);

    }


}
