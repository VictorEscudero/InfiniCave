public class Weapon {
    private String weaponName;
    private int damage;
    private int precision;

    public Weapon(String weaponName, int damage, int precision) {
        this.weaponName = weaponName;
        this.damage = damage;
        this.precision = precision;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                ", damage=" + damage +
                ", precision=" + precision +
                '}';
    }
}
