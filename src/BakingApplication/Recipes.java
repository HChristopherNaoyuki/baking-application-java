package BakingApplication;

// Abstract class that stores basic recipe details
abstract class Recipes implements iRecipes
{
    // Properties for ingredients, time to make, and difficulty level
    protected String ingredients;
    protected int timeToMake;
    protected int difficultyLevel;

    /**
     * Constructor to initialize recipe details
     * @param ingredients - List of ingredients for the recipe
     * @param timeToMake - Time in minutes required to prepare the recipe
     * @param difficultyLevel - Integer representing difficulty level (e.g., 1 to 5)
     */
    public Recipes(String ingredients, int timeToMake, int difficultyLevel)
    {
        this.ingredients = ingredients;
        this.timeToMake = timeToMake;
        this.difficultyLevel = difficultyLevel;
    }

    // Getter methods for the properties
    public String getIngredients()
    {
        return ingredients;
    }

    public int getTimeToMake()
    {
        return timeToMake;
    }

    public int getDifficultyLevel()
    {
        return difficultyLevel;
    }
}
