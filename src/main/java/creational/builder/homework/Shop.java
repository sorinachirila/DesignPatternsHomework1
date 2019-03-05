package creational.builder.homework;

public class Shop {

    private String floor;
    private String walls;
    private String roof;

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "floor='" + floor + '\'' +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
