package design.pattern.model;

public class QAWorker extends Worker  
{  
  
    public QAWorker(String name)  
    {  
        super(name);  
    }  
  
    @Override  
    public void work()  
    {  
        System.out.println(name + "д��������-�ύbug-д��������");  
    }  
  
}
