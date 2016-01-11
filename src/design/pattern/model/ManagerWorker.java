package design.pattern.model;

public class ManagerWorker extends Worker  
{  
  
    public ManagerWorker(String name)  
    {  
        super(name);  
    }  
  
    @Override  
    public void work()  
    {  
        System.out.println(name + "´òdota...");  
    }  
  
}  
