package ex01;

import java.util.Random;


public class CloudStorage {
    Random rand=new Random();
   int numCap;
    
    StorageMedium [] compontents=new StorageMedium[100];
    int sumCap=0;
    
    //Method init()
    public void init(){
        for(int i=0;i<100;++i){
          if(i<=50){ 
             numCap=rand.nextInt((100000-1000)+1000);
             compontents[i]=new USBstick("Sm"+i,numCap);
           
           }else{
           
             numCap=rand.nextInt((100000-1000)+1000);
             compontents[i]=new StorageMedium("Sm"+i,numCap);
             
          } 
              System.out.println(compontents[i].toString());
           }
        
       }
    
     public int getCapacity(){
           for(int j=0;j<100;++j){
               sumCap=sumCap+compontents[j].getCap();
           }
            return sumCap;
        }
}