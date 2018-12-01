public class RegularRoom implements Room{
    @Override
    public String getRoomType() {
        return "Regular Room";
    }

    @Override
    public double getCost() {
        return 50.00;
    }
}
