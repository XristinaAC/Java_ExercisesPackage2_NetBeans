package ex03.greatHouse;

public class HouseStark extends GreatHouse {
    private static HouseStark instance=null;
    
    private HouseStark(String name,String sigil,String words,String lord){
        super(name,sigil,words,lord);
    }
    
    public static HouseStark getInstance(){
        if(instance ==null){
            instance=new HouseStark("Stark","Grey direwolf on a white field","Winter is Coming","Eddard Stark");
        }
        
        return instance;
    }
}
