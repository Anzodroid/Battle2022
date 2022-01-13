public class MainBattle {

    public static void main(String[] args) throws InterruptedException {

        Race troop = new Race();

        for (int i = 0; i<3; i++) {
            troop.Race("ORC");
            troop.Race("DWARF");
        }

        troop.OrcDivision.forEach((n) -> System.out.println("Orc has and attack of "+ n.attack + " armour " +n.armour + " HP of " + n.hp + " and carries a " + n.weapon)); {
        }

        troop.DwarfDivision.forEach((n) -> System.out.println("Dwarf has and attack of "+ n.attack + " armour " +n.armour + " HP of " + n.hp + " and carries a " + n.weapon)); {
        }

        int j =0;
        int k = 0;
        int teamAsize = troop.OrcDivision.size();;
        int teamBsize = troop.DwarfDivision.size();;
        Trooper teamA;
        Trooper teamB;

        while (teamAsize+1 > 0 && teamBsize+1 > 0) {

            teamAsize = troop.OrcDivision.size()-1;
            teamBsize = troop.DwarfDivision.size()-1;

            System.out.println("Orcs have " + (teamAsize+1) + " troops.");
            System.out.println("Dwarfs have " + (teamBsize+1) + " troops.");

            for (int i = 0; i < teamAsize; i++) {

                teamA = troop.OrcDivision.get(i);

                if (teamBsize < j || teamBsize < i) {
                    j = 0;
                }

                teamB = troop.DwarfDivision.get(j);

                Attack attack = new Attack();
                int defenderHp = attack.hit(teamA.race, i , teamA.attack, teamA.weapon, j, teamB.armour, teamB.hp);
                System.out.println(defenderHp);
                teamB.hp = defenderHp;
                if (defenderHp < 1) {
                    System.out.println(j + " Dwarf is dead");
                    troop.DwarfDivision.remove(j);
                    teamBsize--;
                    j = -1;
                    if (teamBsize ==0) {
                        System.out.println("Dwarfs are all dead");
                        break;
                    }
                }
                Thread.sleep(500);
                j++;
            }
                j = 0;

            for (int i = 0; i < teamBsize; i++) {

                teamB = troop.DwarfDivision.get(i);


                if (teamAsize < k || teamAsize < i) {
                    k = 0;
                }

                teamA = troop.OrcDivision.get(k);

                Attack attack = new Attack();
                int defenderHp = attack.hit(teamB.race, i, teamB.attack, teamB.weapon, k, teamA.armour, teamA.hp);
                System.out.println(defenderHp);
                teamA.hp = defenderHp;
                if (defenderHp < 1) {
                    System.out.println(k + " Orc is dead");
                    troop.OrcDivision.remove(k);
                    teamAsize--;
                    k = -1;
                    if (teamAsize ==0) {
                        System.out.println("Orcs are all dead");
                        break;
                    }
                }

                Thread.sleep(500);
                k++;

            }
                k = 0;

            troop.OrcDivision.forEach((n) -> System.out.println("Orc has and attack of " + n.attack + " armour " + n.armour + " HP of " + n.hp + " and carries a " + n.weapon));
            {
            }

            troop.DwarfDivision.forEach((n) -> System.out.println("Dwarf has and attack of " + n.attack + " armour " + n.armour + " HP of " + n.hp + " and carries a " + n.weapon));
            {
            }
        }

        System.out.println("Orcs have " + (teamAsize+1) + " troops.");
        System.out.println("Dwarfs have " + (teamBsize+1) + " troops.");
    }

}
