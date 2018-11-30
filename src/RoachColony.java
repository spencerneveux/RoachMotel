public class RoachColony {
    private String name;
    private int population;
    private int growthRate;

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
    public RoachColony(String name, int population, int growthRate) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }


}
