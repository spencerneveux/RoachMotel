public class FoodBar extends AmenitiesDecorator {

    public FoodBar(Room newRoom) {
        super(newRoom);

        System.out.println("Adding FoodBar");
    }

    public String getRoomType() {
        return tempRoom.getRoomType() + ", FoodBar";
    }

    public double getCost() {
        return tempRoom.getCost() + 10.00;
    }
}
