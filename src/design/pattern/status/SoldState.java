package design.pattern.status;

public class SoldState implements IState  
{  
  
    private VendingMachineW machine;  
  
    public SoldState(VendingMachineW machine)  
    {  
        this.machine = machine;  
    }  
  
    @Override  
    public void insertMoney()  
    {  
        System.out.println("���ڳ���������Ͷ��");  
    }  
  
    @Override  
    public void backMoney()  
    {  
        System.out.println("���ڳ�����û�п��˵�Ǯ");  
    }  
  
    @Override  
    public void turnCrank()  
    {  
        System.out.println("���ڳ����������ظ�ת���ֱ�");  
    }  
  
    @Override  
    public void dispense()  
    {  
        machine.dispense();  
        if (machine.getCount() > 0)  
        {  
            machine.setState(machine.getNoMoneyState());  
        } else  
        {  
            System.out.println("��Ʒ�Ѿ�����");  
            machine.setState(machine.getSoldOutState());  
        }  
    }  
}  