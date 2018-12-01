import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.lang.reflect.Array;
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
    }
}
