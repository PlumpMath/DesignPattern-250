package design.pattern.singlton;


//类加载的时候初始化
public class Singleton  
{  
    private static Singleton instance = new Singleton();  
      
    public static Singleton getInstance()  
    {  
        return instance ;  
    }  
}  