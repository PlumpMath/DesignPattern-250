package design.pattern.singlton;


//����ص�ʱ���ʼ��
public class Singleton  
{  
    private static Singleton instance = new Singleton();  
      
    public static Singleton getInstance()  
    {  
        return instance ;  
    }  
}  