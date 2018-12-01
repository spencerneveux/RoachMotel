public class Suite implements Room{
    @Override
    public String getRoomType() {
        return "Suite";
    }

    @Override
    public double getCost() {
        return 100.00;
    }

    @Override
    public String toString() {
        return getRoomType() + " " + getCost();
    }
}