package design.pattern.singlton;

public class Singleton04  
{  
    private static final class InstanceHolder  
    {  
        private static Singleton04 INSTANCE = new Singleton04();  
    }  
  
    public static Singleton04 getInstance()  
    {  
        return InstanceHolder.INSTANCE;  
    }  
}  