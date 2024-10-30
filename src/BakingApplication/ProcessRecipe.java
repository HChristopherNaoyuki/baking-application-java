package BakingApplication;

// Concrete class that extends Recipes and implements PrintRecipes method
public class ProcessRecipe extends Recipes
{
    /**
     * Constructor for ProcessRecipe
     * @param ingredients - Ingredients needed for the recipe
     * @param timeToMake - Preparation time in minutes
     * @param difficultyLevel - Difficulty level of the recipe (int)
     */
    public ProcessRecipe(String ingredients, int timeToMake, int difficultyLevel)
    {
        super(ingredients, timeToMake, difficultyLevel);
    }

    /**
     * PrintRecipes method to display the recipe details
     */
    @Override
    public void PrintRecipes()
    {
        System.out.println("INGREDIENTS: " + getIngredients());
        System.out.println("TIME TO MAKE: " + getTimeToMake() + " minutes");
        System.out.println("DIFFICULTY LEVEL: " + getDifficultyLevel());
    }
}
