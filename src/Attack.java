public class Attack {
    private String attackName;
    private int damage;

    public Attack(String attackName, int damage) {
        this.attackName = attackName;
        this.damage = damage;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Attack{" +
                "attackName='" + attackName + '\'' +
                ", damage=" + damage +
                '}';
    }
}
