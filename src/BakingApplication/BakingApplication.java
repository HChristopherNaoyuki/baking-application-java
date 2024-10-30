package BakingApplication;

import java.util.Scanner;

// Main class to test the BakingApplication
public class BakingApplication
{
    public static void main(String[] args)
    {
        // Scanner to take input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt for ingredients
        System.out.print("Enter the ingredients: ");
        String ingredients = scanner.nextLine();

        // Prompt for time to make
        System.out.print("Enter time to make (in minutes): ");
        int timeToMake = scanner.nextInt();

        // Prompt for difficulty level
        System.out.print("Enter difficulty level (1-5): ");
        int difficultyLevel = scanner.nextInt();

        // Validate difficulty level input
        if (difficultyLevel < 1 || difficultyLevel > 5)
        {
            System.out.println("Invalid difficulty level. Please enter a value between 1 and 5.");
            return;
        }

        // Instantiate ProcessRecipe with user input
        ProcessRecipe recipe = new ProcessRecipe(ingredients, timeToMake, difficultyLevel);

        // Print the recipe details
        System.out.println("*************************************************");
        recipe.PrintRecipes();
        System.out.println("*************************************************");

        // Close scanner
        scanner.close();
    }
}
