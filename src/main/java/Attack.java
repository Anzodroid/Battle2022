
public class Attack {

    String race;
    int attacker;
    Enum weapon;
    int defenderArmour;
    int defenderHp;
    int attackTeam;
    int defendTeam;

    public int hit(String race, int attackTeam, int attacker, Enum weapon, int defendTeam, int defenderArmour, int defenderHP) {
        this.race = race;
        this.attacker = attacker;
        this.weapon = weapon;
        this.defenderArmour =defenderArmour;
        this.defenderHp = defenderHP;
        this.attackTeam = attackTeam;
        this.defendTeam = defendTeam;

        int roll = (int) (Math.random() * 20 + 1);
        int attack = roll + attacker;
        System.out.println( race + " " + attackTeam + " attacks " + defendTeam + " a quality of " + attack);

        if (attack > defenderArmour) {

            Weapon damage = new Weapon();
            int result = damage.Damage((Weapon.type) weapon);

            int newhp = defenderHp - result;
            System.out.println(" *** Hit *** : " +race + " causes a damage of " + result + " to " + defendTeam + " from a " + weapon);

            return newhp;
        } else {

            System.out.println("... Miss");
            return defenderHp;
//        }

        }

    }
}
