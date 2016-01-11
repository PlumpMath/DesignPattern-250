package design.pattern.decorator;

public class RingEquip implements IEquip  
{  
  
    @Override  
    public int caculateAttack()  
    {  
        return 5;  
    }  
  
    @Override  
    public String description()  
    {  
        return " •’ΩΩ‰÷∏";  
    }  
  
}  