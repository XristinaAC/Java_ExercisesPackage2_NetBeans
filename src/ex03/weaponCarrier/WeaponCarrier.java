package ex03.weaponCarrier;
import ex03.weapon.Weapon;

public abstract class WeaponCarrier {
    private Weapon weapon;
    
    public WeaponCarrier(){
        this.weapon=null;
    }
    
    public Weapon getWeapon(){
        return weapon;
    }
    
    abstract void setWeapon(Weapon weapon);
    
    public boolean hasWeapon(){
        return weapon != null;
    }
}
