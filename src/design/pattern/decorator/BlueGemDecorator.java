package design.pattern.decorator;

public class BlueGemDecorator implements IEquipDecorator  
{  
    /** 
     * ÿ��װ��Ʒά��һ��װ�� 
     */  
    private IEquip equip;  
  
    public BlueGemDecorator(IEquip equip)  
    {  
        this.equip = equip;  
    }  
  
    @Override  
    public int caculateAttack()  
    {  
        return 5 + equip.caculateAttack();  
    }  
  
    @Override  
    public String description()  
    {  
        return equip.description() + "+ ����ʯ";  
    }  
  
}  