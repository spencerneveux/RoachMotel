public class SprayShower extends AmenitiesDecorator {

    public SprayShower(Room newRoom) {
        super(newRoom);
    }

    public String getRoomType() {
        return tempRoom.getRoomType() + ", SprayShower";
    }

    public double getCost() {
        return tempRoom.getCost() + 25.00;
    }
}