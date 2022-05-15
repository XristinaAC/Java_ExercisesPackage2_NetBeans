package ex03.weaponCarrier;

import ex03.warrior.Warrior;
import ex03.weapon.Weapon;
import ex03.weapon.Sword;
import java.util.Random;


public class Swordman extends Soldier {
    //Constructor #1
    public Swordman(String firstName,String lastName){
        super(firstName,lastName,randomSH(),4);
    }
    
      private static int randomSH(){
        Random rand=new Random();
        int number=rand.nextInt((10-5)+1)+5;
        return number;
    }
    
    //Constructor #2
    public Swordman(String firstName,String lastName,int health){
        super(firstName,lastName,checkH(health),4);
    }
     private static int checkH(int health){
        if(health<5 && health>10){
            throw new IllegalArgumentException("Invalid value");
        }
        return health;
    }
    
    public void setWeapon(Weapon weapon){
        if(weapon==null){
            throw new NullPointerException("No weapon found");
        }
        try{
        if(weapon instanceof Sword){
            System.out.println("It's the right weapon");
            
        }else{
            throw new Exception("That is not a weapon for a Swordman");
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
            
    }
    
    public String toString(){
        return getCallSign()+" who has power "+getPower()+" and health "+getHealthCondition();
    }

    @Override
    public void attack(Warrior adversary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isDefeated() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
