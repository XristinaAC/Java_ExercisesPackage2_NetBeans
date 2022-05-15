package ex02.b;

public class Item {
    private String name;
    private int weight;
    
    //Constructor
    public Item(String N,int W){
        this.name=N;
        try{
        if(W<0){
            throw new Exception("Invalid value");
        }else{
        this.weight=W;}
    }
      
    catch(Exception e)
    {
        String message=e.getMessage();
        System.out.println(message);
        System.exit(0);
    }
    }
    
    public String get_Name(){
           return name;
       }
    
    public int get_Weight(){
           return weight;
       }
}