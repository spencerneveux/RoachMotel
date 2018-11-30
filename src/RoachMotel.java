import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RoachMotel {
    private static RoachMotel firstInstance = null;
    private ArrayList<Integer> rooms;


    /**
     * Private constructor to create one instance of Roach Motel
     */
    private RoachMotel() {
        rooms = new ArrayList<>(Arrays.asList(101, 102, 103, 104, 105));
    }

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

    public void checkIn(RoachColony rc, String roomType, ArrayList amenities) {

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
