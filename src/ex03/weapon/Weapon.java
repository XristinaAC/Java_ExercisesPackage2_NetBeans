package ex03.weapon;

import ex03.weaponCarrier.*;

public abstract class Weapon {
     final private int power;
     private WeaponCarrier holder;
     
     public Weapon(int power){
         this.power=power;
         this.holder=null;
     }
     
     public int getPower(){
         return power;
     }
   
     public void setHolder(WeaponCarrier holder){
         this.holder=holder;
     }
     
     public WeaponCarrier getHolder(){
         return holder;
     }
     
     abstract public String toString();   
}