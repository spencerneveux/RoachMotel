import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        RoachMotel rm = RoachMotel.getInstance();
        rm.createRooms();
        System.out.println(rm);
        RoachColony rc1 = new RoachColony("first colony", 100, 200);
        ArrayList amenities = new ArrayList();
        amenities.add("foodbar");
        amenities.add("spa");
        amenities.add("refillbar");
        amenities.add("shower");
        Room r1 = rm.checkin(rc1, "suite", amenities);
        System.out.println(rc1);
        System.out.println(rm);
        RoachColony rc2 = new RoachColony("second colony", 1000, 0.2);
        ArrayList amenities2 = new ArrayList();
        amenities2.add("foodbar");
        Room r2 = rm.checkin(rc2, "deluxe room", amenities2);
        System.out.println(rc2);
        System.out.println(rm);
        RoachColony rc3 = new RoachColony("third colony", 200, 200);
        ArrayList amenities3 = new ArrayList();
        amenities3.add("shower");
        Room r3 = rm.checkin(rc3, "suite", amenities3);

//        Double cost = rm.checkOut(r2, 3);
//        System.out.println("Cost of Stay: " + cost);
//        System.out.println(rm);

    }
}
