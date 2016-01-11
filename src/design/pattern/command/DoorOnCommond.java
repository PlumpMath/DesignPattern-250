package design.pattern.command;

public class DoorOnCommond implements ICommand  
{  
    private Door door ;   
      
    public DoorOnCommond(Door door)  
    {  
        this.door = door;  
    }  
  
    @Override  
    public void execute()  
    {  
    	door.open();  
    }  
  
}  
