package ex01;

public class StorageMedium {
       private String name;
       private int capacity;
       Type type=Type.HD;
       
       //Constractor
       public StorageMedium(String name,int Cap){
           this.name=name;
           this.capacity=Cap;
       }
      
       //Encaptulation Methods
       public void setName(String newName){
           name=newName;
       }
       public String getName(){
           return name;
       }
       
        public void setCapacity(int newCap){
           capacity=newCap;
       }
       public int getCap(){
           return capacity;
       }
       
       //toString Method
       public String toString(){
           return "Storage media: <"+name+">, capacity: <"+capacity+"> bytes, Type <"+type+">.";
       }
}
