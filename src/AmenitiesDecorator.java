abstract class AmenitiesDecorator implements Room {
    protected Room tempRoom;

    public AmenitiesDecorator(Room newRoom) {
        tempRoom = newRoom;
    }

    public String getRoomType() {
        return tempRoom.getRoomType();
    }

    public double getCost() {
        return tempRoom.getCost();
    }
}
