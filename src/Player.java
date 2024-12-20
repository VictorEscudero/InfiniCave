import java.util.ArrayList;

public class Player {
    private String playerName;
    private int health;
    private int luck;
    private int stamina;
    private Weapon weapon;
    private ArrayList<Object> inventory;
    private int inventoryLimit;

    public Player(String playerName, int health, int luck, int stamina, Weapon weapon, int inventoryLimit) {
        this.playerName = playerName;
        this.health = health;
        this.luck = luck;
        this.stamina = stamina;
        this.weapon = weapon;
        this.inventory = new ArrayList<>();
        this.inventoryLimit = inventoryLimit;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Object> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Object> inventory) {
        this.inventory = new ArrayList<>();
    }

    public int getInventoryLimit() {
        return inventoryLimit;
    }

    public void setInventoryLimit(int inventoryLimit) {
        this.inventoryLimit = inventoryLimit;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", health=" + health +
                ", luck=" + luck +
                ", stamina=" + stamina +
                ", weapon=" + weapon +
                ", inventory=" + inventory +
                ", inventoryLimit=" + inventoryLimit +
                '}';
    }
}
