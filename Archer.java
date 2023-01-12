
public class Archer extends Warrior<Bow,Shield>{
    public Archer(String name, int healthpoint, Bow weapon,Shield defense) {
        super(name, healthpoint, weapon,defense);
    }

    @Override
    public String toString() {
        return "Лучник: " + super.toString();
    }
}