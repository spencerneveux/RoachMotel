public class RefillBar extends AmenitiesDecorator {

    public RefillBar(Room newRoom) {
        super(newRoom);

        System.out.println("Adding RefillBar");
    }

    public String getRoomType() {
        return tempRoom.getRoomType() + ", RefillBar";
    }

    public double getCost() {
        return tempRoom.getCost() + 5.00;
    }
}