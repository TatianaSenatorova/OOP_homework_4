
public class Comandor extends Warrior<Weapon,Defense>{
    public Comandor(String name, int healthpoint, Weapon weapon, Shield defense) {
        super(name, healthpoint, weapon, defense);
    }

    @Override
    public String toString() {
        return "Командир: " + super.toString();
    }
}
