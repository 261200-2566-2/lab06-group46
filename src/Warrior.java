public class Warrior extends RPGCharacter{
    /**
     * Constructor for the Warrior class.
     *
     * @param name The name of the Warrior.
     *
     * Preconditions:
     * - name must not be null.
     *
     * Postconditions:
     * - A new Warrior object is created with the specified name, job ("Warrior"), and initial stats.
     * - The Warrior starts at level 1 with initial attack, hp, defense, and runSpeed values.
     * Side Effects: None.
     */
    public Warrior(String name){
        super(name, "Warrior", 15, 100, 5,100);
    }
}
