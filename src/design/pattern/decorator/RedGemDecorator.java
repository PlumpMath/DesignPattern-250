package design.pattern.decorator;

public class RedGemDecorator implements IEquipDecorator  
{  
    /** 
     * ÿ��װ��Ʒά��һ��װ�� 
     */  
    private IEquip equip;  
  
    public RedGemDecorator(IEquip equip)  
    {  
        this.equip = equip;  
    }  
  
    @Override  
    public int caculateAttack()  
    {  
        return 15 + equip.caculateAttack();  
    }  
  
    @Override  
    public String description()  
    {  
        return equip.description() + "+ �챦ʯ";  
    }  
  
}  
