public class Boss extends GameEntity {
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon() {
        this.weapon = weapon;
    }

    private Weapon weapon;

    public Boss(String name, int health, int damage, int attack, Weapon weapon) {
        super(name, health, damage, attack);
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return getName() +
                "health = " + getHealth() +
                "\ndamage = " + getDamage()+
                "\nattack = " + getAttack() +
                "\nweapon = " + getWeapon();
    }
}
