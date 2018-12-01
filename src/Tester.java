public class Tester {
    public static void main(String[] args) {
        Room baseRoom = new FoodBar(new RefillBar(new Spa(new SprayShower(new RegularRoom())))) ;
        System.out.println("Room contains: " + baseRoom.getRoomType());
        System.out.println("Room cost: " + baseRoom.getCost());

    }
}
