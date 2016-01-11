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
        System.out.println(name + "Ð´³ÌÐò-²âbug-fix bug");  
    }  
    @Override  
    public boolean isNeedPrintDate()  
    {  
        return true;  
    }  
}  
