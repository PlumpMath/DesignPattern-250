package design.pattern.decorator;

public class ArmEquip implements IEquip  
{  
  
    @Override  
    public int caculateAttack()  
    {  
        return 20;  
    }  
  
    @Override  
    public String description()  
    {  
        return "������";  
    }  
  
}  

