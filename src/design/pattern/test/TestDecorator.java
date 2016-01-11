package design.pattern.test;

import design.pattern.decorator.ArmEquip;
import design.pattern.decorator.BlueGemDecorator;
import design.pattern.decorator.IEquip;
import design.pattern.decorator.RedGemDecorator;
import design.pattern.decorator.ShoeEquip;
import design.pattern.decorator.YellowGemDecorator;

public class TestDecorator {
	public static void main(String[] args)  
    {  
        // һ����Ƕ2�ź챦ʯ��1������ʯ��ѥ��  
        System.out.println(" һ����Ƕ2�ź챦ʯ��1������ʯ��ѥ��");  
        IEquip equip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));  
        System.out.println("������  : " + equip.caculateAttack());  
        System.out.println("���� :" + equip.description());  
        System.out.println("-------");  
        // һ����Ƕ1�ź챦ʯ��1������ʯ������  
        System.out.println(" һ����Ƕ1�ź챦ʯ��1������ʯ,1�ŻƱ�ʯ������");  
        equip = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new ArmEquip())));  
        System.out.println("������  : " + equip.caculateAttack());  
        System.out.println("���� :" + equip.description());  
        System.out.println("-------");  
    }  
}
