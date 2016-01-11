package design.pattern.command;

public class LightOffCommond implements ICommand  
{  
    private Light light ;   
      
    public LightOffCommond(Light light)  
    {  
        this.light = light;  
    }  
  
    @Override  
    public void execute()  
    {  
        light.off();  
    }  
  
}  

