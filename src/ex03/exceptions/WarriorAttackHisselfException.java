package ex03.exceptions;

import ex03.weaponCarrier.Soldier;

public class WarriorAttackHisselfException extends Exception {
    private Soldier soldierName;
    
    public WarriorAttackHisselfException(Soldier sName){
        super("CannotAttackHimself");
        soldierName=sName;
    }
    
    public String getMessage(){
        return "The warrior "+soldierName+" cannot attack himself";
    }
}