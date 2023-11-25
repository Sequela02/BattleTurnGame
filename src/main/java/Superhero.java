/**
 * The Superhero class represents a superhero character in the game.
 */
public class Superhero {
    private static int idCounter = 0; // Static counter to ensure unique IDs
    private int id;
    private String name;
    private int power; // Attack power
    private int defense;

    /**
     * Creates a new Superhero instance with the specified name, power, and defense values.
     *
     * @param name    The name of the superhero.
     * @param power   The attack power of the superhero.
     * @param defense The defense value of the superhero.
     */
    public Superhero(String name, int power, int defense) {
        this.id = ++idCounter; // Assign unique ID
        this.name = name;
        this.power = power;
        this.defense = defense;
    }

    /**
     * Gets the unique ID of the superhero.
     *
     * @return The ID of the superhero.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the superhero.
     *
     * @return The name of the superhero.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the superhero.
     *
     * @param name The new name to set for the superhero.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the attack power of the superhero.
     *
     * @return The attack power of the superhero.
     */
    public int getPower() {
        return power;
    }

    /**
     * Sets the attack power of the superhero.
     *
     * @param power The new attack power to set for the superhero.
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * Gets the defense value of the superhero.
     *
     * @return The defense value of the superhero.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Sets the defense value of the superhero.
     *
     * @param defense The new defense value to set for the superhero.
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Returns a string representation of the superhero, including its ID, name, power, and defense.
     *
     * @return A string representation of the superhero.
     */
    @Override
    public String toString() {
        return "Superhero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", defense=" + defense +
                '}';
    }
}
