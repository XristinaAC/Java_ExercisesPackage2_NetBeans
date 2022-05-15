package ex03.weaponCarrier;

import ex03.warrior.Warrior;
import ex03.exceptions.*;

public abstract class Soldier extends WeaponCarrier implements Warrior {
    final private String firstName;
    final private String lastName;
    private int health;
    final private int power;
    
    public Soldier(String firstName,String lastName,int health,int power){
        this.firstName=firstName;
        this.lastName=lastName;
        this.health=health;
        this.power=power;
    }
    
    public void attack(Soldier adversary) throws WarriorAttackHisselfException {
        try{
        if(adversary.getFirstName().equals(firstName) && adversary.getLastName().equals(lastName)){
            throw new WarriorAttackHisselfException(adversary);
            }
        }catch(WarriorAttackHisselfException e){
            System.out.println(e.getMessage());
        }
        
        try{
            if(adversary.getHealthCondition()<=0){
                throw new DeadWarriorException();
            }
        }catch(DeadWarriorException e){
            System.out.println(e.getMessage());
        }
        int p;
        p=getPower();
        if(hasWeapon()){
            p=p+getWeapon().getPower();
        }
        
        adversary.setHealthCondition(adversary.getHealthCondition()-p);
        
        System.out.print("The warrior with the name "+this.firstName+ this.lastName+"attacked the warrior ");
        System.out.println(adversary.getCallSign()+" and he/she caused him/her "+adversary.getHealthCondition()+"damage");
        
    }
   
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public int getHealthCondition(){
       return health;
    }
    
    public void setHealthCondition(int condition){
      if(health>0){
          health=condition;
      }
  }
  
  public boolean isDeafeated(){
        if(this.health<=0){
            return true;
        }else{
            return false;
        }
  }
  
  public int getPower(){
      return power;
  }
  
  public String getCallSign(){
      return this.firstName+" "+this.lastName;
  }
  
    public abstract String toString();
}
