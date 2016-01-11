package design.pattern.command;

public class LightOnCommond implements ICommand  
{  
    private Light light ;   
      
    public LightOnCommond(Light light)  
    {  
        this.light = light;  
    }  
  
    @Override  
    public void execute()  
    {  
        light.on();  
    }  
  
}  
