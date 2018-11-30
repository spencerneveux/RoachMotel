public class BaseRoom implements Room{
    @Override
    public String getRoomType() {
        return "Base Room";
    }

    @Override
    public double getCost() {
        return 50.00;
    }
}
