package design.pattern.command;

public class DoorOffCommond implements ICommand  
{  
    private Door door ;   
      
    public DoorOffCommond(Door door)  
    {  
        this.door = door;  
    }  
  
    @Override  
    public void execute()  
    {  
    	door.close();  
    }  
  
}  

