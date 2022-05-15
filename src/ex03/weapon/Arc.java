package ex03.weapon;
import java.util.Random;

public class Arc extends Weapon{
   
    public Arc(){
        super(randomP());
        
    }
    
    public Arc(int power){
        super(checkP(power));
        
    }
    
    private static int randomP(){
        Random rand=new Random();
        int number=rand.nextInt((2-1)+1)+1;
        return number;
    }
    
    private static int checkP(int power){
        if(power<1 || power>2){
            throw new IllegalArgumentException();
        }
        return power;
    }
   
    public String toString(){
        return "The sword has power "+getPower()+" and is owned by "+getHolder();
    }
}
