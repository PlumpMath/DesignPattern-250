package design.pattern.model;

public class HRWorker extends Worker  
{  
  
    public HRWorker(String name)  
    {  
        super(name);  
    }  
  
    @Override  
    public void work()  
    {  
        System.out.println(name + "������-��绰-�ӵ绰");  
    }  
  
}  
