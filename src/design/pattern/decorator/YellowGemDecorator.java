package design.pattern.decorator;

public class YellowGemDecorator implements IEquipDecorator  
{  
    /** 
     * ÿ��װ��Ʒά��һ��װ�� 
     */  
    private IEquip equip;  
  
    public YellowGemDecorator(IEquip equip)  
    {  
        this.equip = equip;  
    }  
  
    @Override  
    public int caculateAttack()  
    {  
        return 10 + equip.caculateAttack();  
    }  
  
    @Override  
    public String description()  
    {  
        return equip.description() + "+ �Ʊ�ʯ";  
    }  
  
}  
