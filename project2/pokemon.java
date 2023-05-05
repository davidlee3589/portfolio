/**
 * This class defines a Pokemon object with a name, hit points, move, move power,
 * and attack speed.
 */
public class Pokemon {
    private String name;
    private int hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;

    /**
     * Constructor for a Pokemon object.
     * 
     * @param name        the name of the Pokemon
     * @param hitPoints   the hit points of the Pokemon
     * @param move        the move of the Pokemon
     * @param movePower   the move power of the Pokemon
     * @param attackSpeed the attack speed of the Pokemon
     */
    public Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }

    /**
     * Getter for the name of the Pokemon.
     * 
     * @return the name of the Pokemon
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name of the Pokemon.
     * 
     * @param name the new name of the Pokemon
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the hit points of the Pokemon.
     * 
     * @return the hit points of the Pokemon
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * Setter for the hit points of the Pokemon.
     * 
     * @param hitPoints the new hit points of the Pokemon
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Getter for the move of the Pokemon.
     * 
     * @return the move of the Pokemon
     */
    public String getMove() {
        return move;
    }

    /**
     * Setter for the move of the Pokemon.
     * 
     * @param move the new move of the Pokemon
     */
    public void setMove(String move) {
        this.move = move;
    }

    /**
     * Getter for the move power of the Pokemon.
     * 
     * @return the move power of the Pokemon
     */
    public int getMovePower() {
        return movePower;
    }

    /**
     * Setter for the move power of the Pokemon.
     * 
     * @param movePower the new move power of the Pokemon
     */
    public void setMovePower(int movePower) {
        this.movePower = movePower;
    }

    /**
     * Getter for the attack speed of the Pokemon.
     * 
     * @return the attack speed of the Pokemon
     */
    public int getAttackSpeed() {
        return attackSpeed;
    }

    /**
     * Setter for the attack speed of the Pokemon.
     * 
     * @param attackSpeed the new attack speed of the Pokemon
     */
    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }