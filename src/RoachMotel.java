import java.util.ArrayList;

public class RoachMotel extends RoomFactory {
    private static RoachMotel firstInstance = null;
    private int numRooms;
    private ArrayList<Room> rooms;


    /**
     * Private constructor to create one instance of Roach Motel
     */
    private RoachMotel() {}

    /**
     * Get instance method to get Roach Motel
     * @return Singleton RoachMotel
     */
    public static RoachMotel getInstance() {
        if (firstInstance == null) {
            firstInstance = new RoachMotel();
        }
        return firstInstance;
    }

    /**
     * Method to create rooms in roach motel
     */
    public void createRooms() {
        rooms = new ArrayList<>();
        for (int i = 0; i < numRooms; i++) {
            rooms.add(new RegularRoom());
        }
    }

    /**
     * Overriding Tostring method
     * @return vacancy if available. Full if not
     */
    public String toString() {
        if (rooms.size() == 0)
            return "No Vacancy";
        return "Available Rooms: " + rooms;
    }
}
