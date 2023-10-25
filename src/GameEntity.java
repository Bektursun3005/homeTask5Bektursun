public class GameEntity {
    private String name;
    private int health;
    private int damage;
    private int attack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public GameEntity(String name, int health, int damage, int attack) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.attack = attack;

    }
}
