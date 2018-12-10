import java.lang.reflect.Array;
import java.util.ArrayList;

public class RoachMotel {
    private static RoachMotel firstInstance = null;
    private RoomFactory rf;
    private FrontDesk frontDesk;
    private FrontDeskObserver frontDeskObserver;
    private int numRooms;
    private ArrayList<Room> availableRooms;
    private ArrayList<Room> bookedRooms;
    private ArrayList<Integer> roomNumbers;


    /**
     * Private constructor to create one instance of Roach Motel
     */
    private RoachMotel(){
        numRooms = 2;
        rf = new RoomFactory();
        frontDesk = new FrontDesk();
        availableRooms = new ArrayList<>();
        roomNumbers = new ArrayList<>();
        bookedRooms = new ArrayList<>();
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

    /**
     * Method to create rooms in roach motel
     */
    public void createRooms() {
        int roomNumber = 100;
        System.out.println("Creating Rooms");
        for (int i = 0; i < numRooms; i++) {
            availableRooms.add(new RegularRoom());
            roomNumbers.add(roomNumber + i);
        }
    }

    /**
     * Method to check in a guest
     * @param rc1 the roach colony checking in
     * @param roomType the type of room being booked
     * @param amenities the amenities included in the room
     * @return a room object
     */
    public Room checkin(RoachColony rc1, String roomType, ArrayList<String> amenities) {
        RoachColony roachColony = rc1;
        Room room = rf.checkIn(roomType, amenities);
        System.out.println("Booked Room: " + room);
        // If all rooms taken
        //Add to waitlist
        if (availableRooms.size() == 0) {
            frontDeskObserver = new FrontDeskObserver(frontDesk);
            frontDesk.addWaitList(frontDeskObserver);
        }
        //Otherwise book room and remove available rooms
        else {
            availableRooms.remove(0);
            roomNumbers.remove(0);
            bookedRooms.add(room);
        }
        return room;
    }

    /**
     * Method to checkout of rooms
     * @param room room to checkout of
     * @param numDays number of days spent in hotel
     */
    public double checkOut(Room room, int numDays) {
        double bill = room.getCost() * numDays;
        return bill;
    }

    /**
     * Overriding Tostring method
     * @return vacancy if available. Full if not
     */
    public String toString() {
        if (availableRooms.size() == 0)
            return "No Vacancy";
        return "Available Rooms: " + roomNumbers + "\nBooked Rooms: " + bookedRooms;
    }
}
