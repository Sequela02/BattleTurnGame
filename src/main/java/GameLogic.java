import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * The GameLogic class represents the logic for a superhero battle game.
 */
public class GameLogic {
    private final List<Superhero> superheroesPool;
    private final List<Superhero> userTeam;
    private final List<Superhero> computerTeam;
    private final Random random;

    /**
     * Initializes a new instance of the GameLogic class.
     * This constructor creates superhero pools and initializes the game.
     */
    public GameLogic() {
        superheroesPool = new ArrayList<>();
        userTeam = new ArrayList<>();
        computerTeam = new ArrayList<>();
        random = new Random();
        initializeSuperheroesPool();
    }

    /**
     * Initializes the pool of superheroes with various characters.
     * Feel free to add or modify superheroes as needed.
     */
    private void initializeSuperheroesPool() {
        // Existing superheroes
        superheroesPool.add(new Superhero("Superman", 90, 80));
        superheroesPool.add(new Superhero("Batman", 70, 60));
        superheroesPool.add(new Superhero("Wonder Woman", 85, 70));
        superheroesPool.add(new Superhero("Flash", 80, 65));
        superheroesPool.add(new Superhero("Green Lantern", 75, 70));
        superheroesPool.add(new Superhero("Aquaman", 70, 65));

        // Additional comic book superheroes
        superheroesPool.add(new Superhero("Spider-Man", 80, 70));
        superheroesPool.add(new Superhero("Iron Man", 85, 75));
        superheroesPool.add(new Superhero("Thor", 95, 85));
        superheroesPool.add(new Superhero("Hulk", 100, 90));
        superheroesPool.add(new Superhero("Black Widow", 65, 60));
        superheroesPool.add(new Superhero("Captain America", 80, 75));

        // Anime characters
        superheroesPool.add(new Superhero("Goku", 100, 90));
        superheroesPool.add(new Superhero("Naruto", 95, 85));
        superheroesPool.add(new Superhero("Saitama2", 100, 100));
        superheroesPool.add(new Superhero("Saitama", 100, 100));
        superheroesPool.add(new Superhero("Vegeta", 95, 85));
    }

    /**
     * Creates the user's superhero team by selecting random heroes from the pool.
     */
    public void createUserTeam() {
        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(superheroesPool.size());
            Superhero chosenHero = superheroesPool.remove(randomIndex);
            userTeam.add(chosenHero);
        }
    }

    /**
     * Creates the computer's superhero team by selecting random heroes from the pool.
     */
    public void createComputerTeam() {
        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(superheroesPool.size());
            Superhero chosenHero = superheroesPool.remove(randomIndex);
            computerTeam.add(chosenHero);
        }
    }

    // Getters for the teams

    /**
     * Gets the user's superhero team.
     *
     * @return The user's superhero team.
     */
    public List<Superhero> getUserTeam() {
        return userTeam;
    }

    /**
     * Gets the computer's superhero team.
     *
     * @return The computer's superhero team.
     */
    public List<Superhero> getComputerTeam() {
        return computerTeam;
    }

    /**
     * Starts the battle between the user's team and the computer's team.
     * Uses a console-based interface for the battle.
     */
    public void startBattle() {
        Scanner scanner = new Scanner(System.in);

        while (!userTeam.isEmpty() && !computerTeam.isEmpty()) {
            System.out.println("\n=== Select a Superhero from Your Team for the Battle ===");
            printTeam(userTeam);
            System.out.print("Choose your fighter (1-" + userTeam.size() + "): ");
            int userChoiceIndex = Integer.parseInt(scanner.nextLine()) - 1;

            Superhero userHero = userTeam.get(userChoiceIndex);
            Superhero computerHero = computerTeam.get(random.nextInt(computerTeam.size()));

            System.out.println("\n>>> BATTLE <<<");
            System.out.println(userHero.getName() + " (User) vs. " + computerHero.getName() + " (Computer)");

            if (userHero.getPower() > computerHero.getDefense()) {
                System.out.println("💥 " + userHero.getName() + " wins the duel!");
                computerTeam.remove(computerHero);
            } else if (userHero.getPower() == computerHero.getDefense()) {
                System.out.println("💥 " + userHero.getName() + " and " + computerHero.getName() + " are evenly matched!");
            }
                else{
                System.out.println("💥 " + computerHero.getName() + " wins the duel!");
                userTeam.remove(userHero);
            }

            System.out.println("\nCurrent Team Status:");
            System.out.println("Your Team: " + teamStatus(userTeam));
            System.out.println("Computer's Team: " + teamStatus(computerTeam));
        }

        System.out.println("\n=== Battle Conclusion ===");
        if (userTeam.isEmpty()) {
            System.out.println("🏆 Computer wins the battle!");
        } else {
            System.out.println("🏆 User wins the battle!");
        }
    }

    /**
     * Returns the status of a team, indicating the number of fighters remaining.
     *
     * @param team The team to check.
     * @return A string representing the team's status.
     */
    private String teamStatus(List<Superhero> team) {
        if (team.isEmpty()) {
            return "No fighters left!";
        }
        return "Fighters remaining: " + team.size();
    }

    /**
     * Prints the list of superheroes in a team along with their indices.
     *
     * @param team The team to print.
     */
    private void printTeam(List<Superhero> team) {
        for (int i = 0; i < team.size(); i++) {
            System.out.println((i + 1) + ". " + team.get(i).getName());
        }
    }

}
