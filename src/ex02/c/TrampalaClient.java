package ex02.c;

import ex02.b.Trampala;
import ex02.b.Item;

public class TrampalaClient {
    public static void main(String[] args){
        //Exampe of the seesaw breaking according to the implementation 
        //from the subquerie (b).
        Trampala seesaw=new Trampala(40);
        Item o1=new Item("Box1",5);
        Item o2=new Item("Box2",10);
        
        seesaw.rLoad(o1.get_Weight());
        seesaw.lLoad(o2.get_Weight());
        
        System.out.println(seesaw.tCondition());
        
        seesaw.rLoad(o1.get_Weight());
        
        System.out.println(seesaw.tCondition());
    }
}