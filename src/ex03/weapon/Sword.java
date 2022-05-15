package ex03.weapon;
import ex03.weaponCarrier.*;
import java.util.Random;

public class Sword extends Weapon{
     public Sword(){
        super(randomP());
    }
    
    public Sword(int power){
        super(checkP(power));
        
    }
    
     private static int randomP(){
        Random rand=new Random();
        int number=rand.nextInt((4-3)+1)+3;
        return number;
    }
    
    private static int checkP(int power){
        if(power<3 || power>4){
            throw new IllegalArgumentException();
        }
        return power;
    }
   
    public String toString(){
        return "The sword has power "+getPower()+" and is owned by "+getHolder();
    }
    
    public static void main(String args[]){
        Sword s=new Sword(4);
        s.setHolder(new Swordman("Nedd","Stark"));
        System.out.println(s.toString());
    }
}
