public class Spa extends AmenitiesDecorator {

    public Spa(Room newRoom) {
        super(newRoom);

        System.out.println("Adding Spa");
    }

    public String getRoomType() {
        return tempRoom.getRoomType() + ", Spa";
    }

    public double getCost() {
        return tempRoom.getCost() + 20.00;
    }
}