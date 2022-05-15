package ex01;

public class USBstick extends StorageMedium {
    private String name;
    private int capacity;
    Type type=Type.FlashDrive;

    public USBstick(String name,int Cap) {
        super(name,Cap);
        
    }
   
    @Override
     public String toString(){
         return "USB Stick Storage Media <"+super.getName()+">, Capacity: <"+super.getCap()+"> bytes, Type <"+type+">.";
     }
}
