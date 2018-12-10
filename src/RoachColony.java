public class RoachColony {
    private String name;
    private int population;
    private double growthRate;

    /**
     * Null Constructor
     */
    public RoachColony() {}

    /**
     * Overloaded Constructor
     * @param name name of colony
     * @param population total population
     * @param growthRate int value of growth rate
     */
    public RoachColony(String name, int population, double growthRate) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }

    public String toString() {
        return (name + " " + population);
    }
}
