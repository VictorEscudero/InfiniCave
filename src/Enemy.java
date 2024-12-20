import java.util.ArrayList;

public class Enemy {
    private String enemyName;
    private int life;
    private Attack attack;

    public Enemy(String enemyName, int life, Attack attack) {
        this.enemyName = enemyName;
        this.life = life;
        this.attack = attack;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "enemyName='" + enemyName + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                '}';
    }
}
