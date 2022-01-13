import java.util.ArrayList;
import java.util.List;

public class Race {

    String race;
    int attack;
    int armour;
    int hp;
    Enum weapon;

    public List<Trooper> OrcDivision = new ArrayList<Trooper>();
    public List<Trooper> DwarfDivision = new ArrayList<Trooper>();

    public void Race (String race){
        this.race = race;

        if (race == "ORC") {
            this.attack = 3;
            this.armour = 15;
            this.hp = 17 + (int)(Math.random() * 5 + 1);
            this.weapon = Weapon.type.GreatAxe;
            Trooper Orc = new Trooper(this.race, this.attack, this.armour, this.hp , this.weapon);
            OrcDivision.add(Orc);
        }

        if (race == "DWARF") {
            attack = 2;
            armour = 18;
            hp = 20 + (int)(Math.random() * 3 + 1);
            weapon = Weapon.type.Warhammer;
            Trooper Dwarf = new Trooper(this.race, this.attack, this.armour, this.hp , this.weapon);
            DwarfDivision.add(Dwarf);
        }
        System.out.println(" Solider: " + race + " " + weapon + " HP " + hp);
    }

}



