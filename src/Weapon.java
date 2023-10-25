public class Weapon {
    private String name;
    private String typeWeapon;

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", typeWeapon='" + typeWeapon + '\'' +
                '}';
    }

    public Weapon(String name, String typeWeapon) {
        this.name = name;
        this.typeWeapon = typeWeapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }
}
