package design.pattern.status;

public class NoMoneyState implements IState  
{  
  
    private VendingMachineW machine;  
  
    public NoMoneyState(VendingMachineW machine)  
    {  
        this.machine = machine;  
          
    }  
      
    @Override  
    public void insertMoney()  
    {  
        System.out.println("Ͷ�ҳɹ�");  
        machine.setState(machine.getHasMoneyState());  
    }  
  
    @Override  
    public void backMoney()  
    {  
        System.out.println("��δͶ�ң�����Ǯ��...");  
    }  
  
    @Override  
    public void turnCrank()  
    {  
        System.out.println("��δͶ�ң����ö���ô��...");  
    }  
  
    @Override  
    public void dispense()  
    {  
        throw new IllegalStateException("�Ƿ�״̬��");  
    }  
  
}  
