

/**
 * The SuperheroBattle class is the entry point of the superhero battle game.
 */
public class SuperheroBattle {

    /**
     * The main method that initializes the game, creates teams, and starts the battle.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic();

        // Create user team
        gameLogic.createUserTeam();

        // Create computer team with the same number of heroes
        gameLogic.createComputerTeam();

        // Start the battle
        System.out.println("Starting the superhero battle...");
        gameLogic.startBattle();

        // Battle ends when one team is out of superheroes
    }
}
