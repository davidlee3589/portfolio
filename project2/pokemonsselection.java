import java.util.Scanner;

/**
 * Class for selecting Pokemon values to create an instance of Pokemon.
 * Group members: [insert names here]
 */
public class PokemonSelection {
    private Scanner scanner;

    /**
     * Constructor that initializes the scanner.
     */
    public PokemonSelection() {
        scanner = new Scanner(System.in);
    }

    /**
     * Method that asks the user to select values needed to create a Pokemon.
     * @return The created Pokemon instance.
     */
    public Pokemon createPokemon() {
        System.out.print("Enter name of Pokemon: ");
        String name = scanner.nextLine();

        System.out.print("Enter hit points of Pokemon: ");
        int hitPoints = scanner.nextInt();

        System.out.print("Enter move of Pokemon: ");
        scanner.nextLine(); // consume the newline character
        String move = scanner.nextLine();

        System.out.print("Enter move power of Pokemon: ");
        int movePower = scanner.nextInt();

        System.out.print("Enter attack speed of Pokemon: ");
        int attackSpeed = scanner.nextInt();

        // Create a new Pokemon instance with the above values and return it.
        return new Pokemon(name, hitPoints, move, movePower, attackSpeed);
    }

    /**
     * Method that assigns a Pokemon to each player.
     * @param player1 The first player.
     * @param player2 The second player.
     */
    public void assignPokemon(int player1, int player2) {
        // Assign a Pokemon to player 1.
        System.out.println("Player " + player1 + ": Select a Pokemon and enter its stats");
        Pokemon pokemon1 = createPokemon();
        System.out.println("Player " + player1 + " Pokemon");
        System.out.println(pokemon1.displayPokemonStats());

        // Assign a Pokemon to player 2.
        System.out.println("Player " + player2 + ": Select a Pokemon and enter its stats");
        Pokemon pokemon2 = createPokemon();
        System.out.println("Player " + player2 + " Pokemon");
        System.out.println(pokemon2.displayPokemonStats());

        scanner.close();
    }
}