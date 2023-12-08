public class Tank extends RPGCharacter{
    /**
     * Constructor for the Tank class.
     *
     * @param name The name of the Tank.
     *
     * Preconditions:
     * - name must not be null.
     *
     * Postconditions:
     * - A new Tank object is created with the specified name, job ("Tank"), and initial stats.
     * - The Tank starts at level 1 with initial attack, hp, defense, and runSpeed values.
     * Side Effects: None.
     */
    public Tank(String name){
        super(name, "Tank", 10, 200, 8,80);
    }
}
