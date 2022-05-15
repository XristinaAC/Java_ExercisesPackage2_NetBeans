package ex03.greatHouse;

public class HouseLannister extends GreatHouse {
    private static HouseLannister instance=null;
    
    private HouseLannister(String name,String sigil,String words,String lord){
        super(name,sigil,words,lord);
    }

    public static HouseLannister getInstance(){
        if(instance ==null){
            instance=new HouseLannister("Lannister","A golden lion rampant on a crimson field","Hear me Roar","Tywin Lannister");
        }
        
        return instance;
    }
}
