public class DeluxeRoom implements Room{
    @Override
    public String getRoomType() {
        return "Deluxe Room";
    }

    @Override
    public double getCost() {
        return 75.00;
    }
}