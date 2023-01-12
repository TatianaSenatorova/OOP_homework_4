
public class Barbarian extends Warrior<Axe,Shield> {
    public Barbarian(String name, int healthpoint, Axe weapon, Shield defense) {
        super(name, healthpoint, weapon, defense);
    }

    @Override
    public String toString() {
        return "Варвар: " + super.toString();
    }
}