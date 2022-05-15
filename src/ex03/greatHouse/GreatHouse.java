package ex03.greatHouse;

import java.util.ArrayList;
import ex03.weaponCarrier.Soldier;
import java.util.Random;

public abstract class GreatHouse {
    final private String name;
    final private String sigil;
    final private String words;
    final private String lord;
    ArrayList<Soldier> army;
    
    public GreatHouse(String name,String sigil,String words,String lord){
        this.name=name;
        this.sigil=sigil;
        this.words=words;
        this.lord=lord;
    }
    
    public void addSoldier(Soldier soldier){
        if(soldier!=null){
          this.army.add(soldier);
        }
    }
    
    public Soldier getSoldier(){
        Random rand = new Random();
        int n = rand.nextInt(this.army.size() - 1 + 1) + 1;
        
        if(this.army.get(n).getHealthCondition()<0){
            throw new IllegalArgumentException("Dead warrior");}
        return this.army.get(n);
    }
    
    public boolean isDefeated(){
        if(this.army != null)
        {
            System.out.println(this.lord);
            return this.army.isEmpty();
        }
        
        System.out.println(this.lord);
        return true;
    }
    
    public String toString(){
        return "The Great House "+name+" has lord "+lord+". Their sigil is a "+sigil+""
                + " and their words are "+words+".";
    }
 }
