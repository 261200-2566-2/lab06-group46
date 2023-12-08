import java.util.ArrayList;
import java.util.List;

public class RPGCharacter {
    protected String name;
    protected String job;
    protected int level;
    protected List<Accessory> accessories;
    protected int attack;
    protected int hp;
    protected int defense;
    protected double runSpeed;

// ------------------------------------------------------------------------------------------------
   /**
     * Constructor for creating an RPGCharacter.
     *
     * @param name      The name of the character.
     * @param job       The job or class of the character.
     * @param attack    The base attack value of the character.
     * @param hp        The base health points of the character.
     * @param defense   The base defense value of the character.
     * @param runSpeed  The base running speed of the character.
     */
    public RPGCharacter(String name,String job,int attack,int hp,int defense,double runSpeed) {
        this.name = name;
        this.job = job;
        this.level = 1;
        this.accessories = new ArrayList<>();
        this.attack = attack;
        this.hp = hp;
        this.defense = defense;
        this.runSpeed = runSpeed;
    }

// ------------------------------------------------------------------------------------------------
    /**
     * Method to reduce the character's health points based on the specified damage.
     *
     * @param damage The amount of damage to be inflicted on the character.
     *
     * Precondition: damage must be a non-negative integer.
     * Postcondition: The character's HP is reduced by the specified damage.
     * Side Effect: The character's HP is updated.
     */
    public void takeDamage(int damage) {
        hp -= damage;
    }
    /**
     * Method to perform an attack on another RPGCharacter.
     *
     * @param target The target RPGCharacter to be attacked.
     *
     * Precondition: target must not be null.
     * Postcondition: The target's HP is reduced by the character's attack value.
     * Side Effect: None.
     */
    public void attack(RPGCharacter target) {
        int damageDealt = attack;
        System.out.println(name + " attacks " + target.getName() + " for " + damageDealt  + "damage!");
        target.takeDamage(damageDealt);
    }
     /**
      * Method to defend against an attacker's attack.
      *
      * @param attacker The RPGCharacter launching the attack.
      *
      * Precondition: attacker must not be null.
      * Postcondition: The character defends against the attacker's attack, reducing the damage taken based on defense.
      * Side Effect: The character's HP is updated.
      */
    public void defend(RPGCharacter attacker) {
        int damageReduction = defense / 2;
        int damageTaken = Math.max(0, attacker.attack - damageReduction);
        System.out.println(name + " defends against " + attacker.getName() + "!");
        takeDamage(damageTaken);
    }
    /**
     * Getter for the character's name.
     *
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }
    /**
     * Getter for the character's running speed.
     *
     * @return The running speed of the character.
     */
    public double getRunSpeed() {
        return runSpeed;
    }
    /**
     * Setter for the character's health points.
     *
     * @param hp The new health points value.
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
    /**
     * Setter for the character's running speed.
     *
     * @param runSpeed The new running speed value.
     */
    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }
    /**
     * Method to equip an accessory to the character, applying its bonuses.
     *
     * @param accessory The accessory to be equipped.
     *
     * Precondition: accessory must not be null.
     * Postcondition: The accessory's bonuses are applied to the character.
     * Side Effect: The character's stats are updated based on the equipped accessory.
     */
    public void equipAccessory(Accessory accessory) {
        accessories.add(accessory);
        accessory.addBonus(this);
    }

    /**
     * Method to level up the character.
     *
     * Postcondition: The character's level is increased, and HP and run speed are updated accordingly.
     * Side Effect: The character's level, HP, and run speed are updated.
     */
    public void levelUp() {
        level++;
        setHp(this.hp + 10 * level);
        setRunSpeed(this.runSpeed += this.runSpeed * (0.1 + 0.03 * level));
        System.out.printf("%s levels up to level %d!\n", name, level);
    }

// ------------------------------------------------------------------------------------------------
    /**
     * Method to display information about the character.
     *
     * Side Effect: Information about the character is printed to the console.
     */
    public void displayInfo() {
        System.out.println("Character Information:");
        System.out.println("Name: " + name);
        System.out.println("Job: " + job);
        System.out.println("Level: " + level);
        System.out.println("Attack: " + attack);
        System.out.println("Hp: " + hp);
        System.out.println("Defense: " + defense);
        System.out.println("Run Speed: " + getRunSpeed());
        System.out.print("Accessories: ");
        for (Accessory accessory : accessories) {
            System.out.print(accessory.getName() + " ");
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------------------------");
    }


}


