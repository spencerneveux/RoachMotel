import java.lang.reflect.Array;
import java.util.ArrayList;
public class RoomFactory {
    public Room checkIn(String roomType, ArrayList<String> amenities) {
        Room tempRoom = null;

        if (roomType.equals("regular room")) {

            tempRoom = new RegularRoom();

        }else if (roomType.equals("deluxe room")) {

            tempRoom = new DeluxeRoom();

        }else if (roomType.equals("suite")) {

            tempRoom = new Suite();
        }

        for (String item : amenities) {
            if (item.equals("spa"))
                tempRoom = new Spa(tempRoom);
            if (item.equals("foodbar"))
                tempRoom = new FoodBar(tempRoom);
            if (item.equals("shower"))
                tempRoom = new SprayShower(tempRoom);
            if (item.equals("refillbar"))
                tempRoom = new RefillBar(tempRoom);
        }

        return tempRoom;
    }
}
