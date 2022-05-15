package ex03.weaponCarrier;

import ex03.warrior.Warrior;
import ex03.weapon.Weapon;
import ex03.weapon.Arc;

import java.util.Random;

public class Archer extends Soldier {
//Constructor #1
    public Archer(String firstName,String lastName){
        super(firstName,lastName,randomAH(),2);
    }
    
      private static int randomAH(){
        Random rand=new Random();
        int number=rand.nextInt((10-5)+1)+5;
        return number;
    }
    //Constructor #2
    public Archer(String firstName,String lastName,int health){
        super(firstName,lastName,checkH(health),2);
    }
     private static int checkH(int health){
        if(health<1 && health>5){
            throw new IllegalArgumentException("Invalid value");
        }
        return health;
    }
    
    public void setWeapon(Weapon weapon){
        if(weapon==null){
            throw new NullPointerException("No weapon found");
        }
        try{
        if(weapon instanceof Arc){
            System.out.println("It's the right weapon");
            
        }else{
            throw new Exception("That is not a weapon for an Archer");
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
            
    }
    
    public String toString(){
        return "The Archer "+getCallSign()+" has power "+getPower()+" and health "+getHealthCondition();
    }

   @Override
    public void attack(Warrior adversary) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isDefeated() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
