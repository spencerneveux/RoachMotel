
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        RoachMotel rm = RoachMotel.getInstance();
        rm.createRooms();
        ArrayList<String> amenities = new ArrayList<>();
        amenities.add("spa");
        amenities.add("foodbar");
        amenities.add("shower");
        Room r1 = rm.checkIn("suite", amenities);
        System.out.println(r1);


        //Testing observer
        FrontDesk frontDesk = new FrontDesk();
        FrontDeskObserver observer1 = new FrontDeskObserver(frontDesk);
        FrontDeskObserver observer2 = new FrontDeskObserver(frontDesk);
        frontDesk.addWaitList(observer1);
        frontDesk.addWaitList(observer2);
        frontDesk.removeWaitList(observer1);
    }
}
