public interface BonusStats {
  /**
     * Gets the name of the bonus.
     *
     * @return The name of the bonus.
     *
     * Preconditions: None.
     * Postconditions: The method does not modify the state of the object.
     * Side Effects: None.
     */
    String getName();
    /**
     * Adds bonus stats to an RPGCharacter.
     *
     * @param character The RPGCharacter to which the bonuses are applied.
     *
     * Preconditions:
     * - character must not be null.
     * - The implementation should handle the null case gracefully.
     *
     * Postconditions: The RPGCharacter's stats are modified based on the bonus.
     * Side Effects: The RPGCharacter's stats are updated.
     */
    void addBonus(RPGCharacter character);
}
