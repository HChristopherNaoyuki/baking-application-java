# Baking Application

This Java-based console application captures and displays recipe details such as ingredients, preparation time, and difficulty level. Designed in a modular structure, it uses interfaces and abstract classes, providing a clean and readable codebase in Allman style. User input is validated, making it beginner-friendly and efficient.

## Table of Contents
- [Features](#features)
- [Structure](#structure)
- [Installation](#installation)
- [Usage](#usage)
- [Example Output](#example-output)
- [Contributing](#contributing)
- [License](#license)

---

## Features
- **Recipe Entry**: Collects recipe details including ingredients, preparation time (in minutes), and difficulty level (1-5).
- **User Input Validation**: Ensures difficulty level input is within the 1-5 range.
- **Structured Design**: Uses interface and abstract class to implement `PrintRecipes` method, following clean OOP principles.
- **Allman Style**: Written in Allman style for readability, with clear, detailed comments.

## Structure
The project consists of four Java files:
1. **`iRecipes.java`** - Defines the `iRecipes` interface with `PrintRecipes` method.
2. **`Recipes.java`** - Abstract class implementing `iRecipes`, with properties for ingredients, time to make, and difficulty level.
3. **`ProcessRecipe.java`** - Extends `Recipes` and implements `PrintRecipes` to display recipe details.
4. **`BakingApplication.java`** - Main class to capture user input, validate it, and instantiate `ProcessRecipe` to output the details.

## Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/baking-application-java.git
   cd BakingApplication
   ```
2. **Compile the Java Files**:
   Make sure Java is installed, then compile the files:
   ```bash
   javac BakingApplication/*.java
   ```

## Usage
Run the main application:
```bash
java BakingApplication.BakingApplication
```

Follow the prompts to enter the recipe details.

## Example Output

```
Enter the ingredients: Flour, Sugar, Eggs, Milk, Butter
Enter time to make (in minutes): 45
Enter difficulty level (1-5): 3
*************************************************
BAKING APPLICATION
*************************************************
Recipe Details:
Ingredients: Flour, Sugar, Eggs, Milk, Butter
Time to Make: 45 minutes
Difficulty Level: 3
*************************************************
```

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/NewFeature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature/NewFeature`).
5. Open a Pull Request.

## License
This project is licensed under the MIT License.

---
