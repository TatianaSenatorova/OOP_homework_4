
public class Main {
    public static void main(String[] args) {
        Comandor comandor = new Comandor("Ivan",100,new BigSword(),new BigShield());
        Team<Archer> archerTeam = new Team<>(comandor);
        System.out.println(comandor);
        archerTeam.addWarriors(new Archer("Petr",89,new LongBow(),new BigShield()));
        archerTeam.addWarriors(new Archer("Tom",59,new LongBow(),new BigShield()));
        archerTeam.addWarriors(new Archer("Vasya",44,new LongBow(),new BigShield()));
        archerTeam.forEach(System.out::println);
        System.out.println("Суммарный урон:" + archerTeam.getAllDamage()+" "+
                "Суммарное здоровье:"+ " " + archerTeam.getAllHealthPoint() + " " +
                "Зона поражение макс:"+ " " + archerTeam.getMaxRadius()+ " " + "Минимальная защита: " + archerTeam.minProtected());
        System.out.println("------------------------");
        Comandor comandor2 = new Comandor("Mark",200,new LongBow(),new BigShield());
        Team<Barbarian> axes = new Team<>(comandor2);
        axes.addWarriors(new Barbarian("ars",32,new Sekira(),new BigShield()));
        System.out.println(comandor2);
        for (Barbarian item: axes) {
            System.out.println(item);
        }
        System.out.println("Суммарный урон" + axes.getAllDamage()+
                "Суммарное здоровье" + axes.getAllHealthPoint() +
                "Зона поражение макс: " + axes.getMaxRadius() + " " +
                "Мин защита: " + axes.minProtected());
        System.out.println("----------------------");
        Comandor comandor3 = new Comandor("Matvey",200,new BigSword(),new BigShield());
        Team<Warrior> warriorTeam = new Team<>(comandor3);
        warriorTeam.addWarriors(new Barbarian("Anton",54,new Sekira(),new BigShield()));
        warriorTeam.addWarriors(new Archer("Guk",66,new LongBow(),new BigShield()));

        System.out.println(comandor3);
        warriorTeam.forEach(System.out::println);
        System.out.println("Суммарный урон-" + warriorTeam.getAllDamage()+ " " +
                "Суммарное здоровье-" + warriorTeam.getAllHealthPoint() + " " +
                "Зона поражение макс- " + warriorTeam.getMaxRadius() + " " +
                "Мин защита- " + warriorTeam.minProtected());

    }
}