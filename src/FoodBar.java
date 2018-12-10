public class FoodBar extends AmenitiesDecorator {

    public FoodBar(Room newRoom) {
        super(newRoom);
    }

    public String getRoomType() {
        return tempRoom.getRoomType() + ", FoodBar";
    }

    public double getCost() {
        return tempRoom.getCost() + 10.00;
    }
}
