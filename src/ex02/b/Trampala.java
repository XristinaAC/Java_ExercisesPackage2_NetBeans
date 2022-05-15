package ex02.b;

import java.lang.IllegalArgumentException;
import java.lang.Error;

public class Trampala {
    private double leftS;//Left side of the seesaw
    private double rightS;//Right side ot the seesaw
    private double K;//The maximum weight the seesaw can hold
    
    //Constuctor
    public Trampala(double newWeight){
        if(newWeight<0){
            throw new IllegalArgumentException("Invalid value");
        }else{
            this.K=newWeight;
        }
        this.leftS=0;
        this.rightS=0;
    }
    
    //Transformers
    public double lLoad(double newLoad){
        if(newLoad<0){
             throw new IllegalArgumentException("Invalid value");
        }else{
            leftS=newLoad;
            return leftS;
        }
    }
     public double rLoad(double newLoad){
        if(newLoad<0){
             throw new IllegalArgumentException("Invalid value");
        }else{
            rightS=rightS+newLoad;
            return rightS;
        }
    }
     
    public double lUnload(double oLoad){//the load of the object
        if(leftS==0){
            System.out.println("The left side of the seesaw is empty,there is nothing to unload");
            return 0;
        }else{
            leftS=Math.abs(leftS-oLoad);
            return leftS;
        }
    }
    
     public double rUnload(double oLoad){
        if(rightS==0){
            System.out.println("The right side of the seesaw is empty,there is nothing to unload");
            return 0;
        }else{
            rightS=Math.abs(rightS-oLoad);
            return rightS;
        }
    }
     
    //Observer
    public boolean Balance(){
        if(leftS==rightS){
            System.out.println("The seesaw is balanced");
            return true;
        }else{
            return false;
        }
    }
     
    //Accesors
    public int loadExistence(){
        if(leftS==0 && rightS==0){
            System.out.println("The seesaw is empty");
            return -1;
        }else if(leftS==0 && rightS!=0){
            System.out.println("The seesaw is loaded only from the right side");
            return 1;
        }else if(leftS!=0 && rightS==0){
            System.out.println("The seesaw is loaded only from the left side");
            return 1;
        }else{
            System.out.println("The seesaw is loaded only from both sides");
            return 0;
        } 
    }
    
    public String tCondition(){
        if(Balance() && (leftS+rightS>K)){
            throw new Error("The seesaw is broken");
        }else if(Balance() && (leftS+rightS<K)){
                return "The seesaw is not broken";
        }else{
            if(rightS+leftS>K){
                throw new Error("The seesaw is broken");
           }else if(rightS>K && leftS!=0){
               throw new Error("The seesaw is broken");
           }else if(rightS!=0 && leftS>K){
               throw new Error("The seesaw is broken");
           }else{
               return "The seesaw is not broken";
           }
        }
    }
    
    public double totalWeight(){
        double w;
        w=leftS+rightS;
        return w;
    }
}

