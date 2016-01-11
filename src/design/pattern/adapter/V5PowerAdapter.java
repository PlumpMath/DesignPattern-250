package design.pattern.adapter;

public class V5PowerAdapter implements IV5Power  
{  
    /** 
     * ��ϵķ�ʽ 
     */  
    private V220Power v220Power ;  
      
    public V5PowerAdapter(V220Power v220Power)  
    {  
        this.v220Power = v220Power ;  
    }  
  
    @Override  
    public int provideV5Power()  
    {  
        int power = v220Power.provideV220Power() ;  
        //power�������ֲ���-->5   
        System.out.println("�������������ĵ������˵�ѹ��");  
        return 5 ;   
    }   
      
}  
