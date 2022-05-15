package ex03.exceptions;

public class DeadWarriorException extends Exception {
     public DeadWarriorException(){
         super("The warrior is dead,his battle is over");
     }
}
