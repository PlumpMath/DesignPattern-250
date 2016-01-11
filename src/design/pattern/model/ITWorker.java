package design.pattern.model;

public class ITWorker extends Worker  
{  
  
    public ITWorker(String name)  
    {  
        super(name);  
    }  
  
    @Override  
    public void work()  
    {  
        System.out.println(name + "д����-��bug-fix bug");  
    }  
    @Override  
    public boolean isNeedPrintDate()  
    {  
        return true;  
    }  
}  
