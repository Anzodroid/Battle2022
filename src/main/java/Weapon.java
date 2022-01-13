import java.util.Random;

public class Weapon {
    int result;

    public enum type {
        Warhammer,
        GreatAxe
    }

    public int Damage (type weaponType){

    switch (weaponType){
        case Warhammer:
            result = (int)(Math.random() * 8 + 1);
            break;
        case GreatAxe:
            result = (int)(Math.random() * 12 + 1);
            break;
    }

    return result;
    }

//    public int Warhammer (){
//        int result = (int)(Math.random() * 8 + 1);
//        return result;
//    }
//
//    public int GreatAxe (){
//        int result = (int)(Math.random() * 12 + 1);
//        return result;
//    }


}
