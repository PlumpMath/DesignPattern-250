package design.pattern.adapter;

public class Mobile {
	public void inputPower(IV5Power power)  
    {  
        int provideV5Power = power.provideV5Power();  
        System.out.println("�ֻ����ͻ��ˣ�������Ҫ5V��ѹ��磬������-->" + provideV5Power + "V");  
    } 
}
