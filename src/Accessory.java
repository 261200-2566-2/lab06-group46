public class Accessory implements BonusStats{
    protected String name;
    protected int bonusAtk;
    protected int bonusHp;
    protected int bonusDef;
    protected int weight;

// ------------------------------------------------------------------------------------------------
  /**
     * Constructor for creating an accessory.
     *
     * @param name      The name of the accessory.
     * @param bonusAtk  The bonus attack value provided by the accessory.
     * @param bonusHp   The bonus health points provided by the accessory.
     * @param bonusDef  The bonus defense value provided by the accessory.
     * @param weight    The weight of the accessory affecting the character's run speed.
     *
     * Preconditions: None.
     * Postconditions: An Accessory object is created with specified attributes.
     * Side Effect: None.
     */
    public Accessory(String name, int bonusAtk,int bonusHp,int bonusDef,int weight){
        this.name = name;
        this.bonusAtk = bonusAtk;
        this.bonusHp = bonusHp;
        this.bonusDef = bonusDef;
        this.weight = weight;
    }
   /**
     * Getter for the name of the accessory.
     * 
     * @return The name of the accessory.
     * 
     * Preconditions: None.
     * Postconditions: None.
     * Side Effect: None.
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * Method to add bonuses provided by the accessory to an RPGCharacter.
     * 
     * @param character The RPGCharacter to which the bonuses are applied.
     * 
     * Preconditions: character must not be null.
     * Postconditions: The RPGCharacter's attack, HP, defense, and run speed are modified based on accessory bonuses.
     * Side Effect: The RPGCharacter's stats are updated.
     */
    @Override
    public void addBonus(RPGCharacter character) {
        character.attack += bonusAtk;
        character.hp += bonusHp;
        character.defense += bonusDef;
        character.runSpeed -= weight;
    }

}
