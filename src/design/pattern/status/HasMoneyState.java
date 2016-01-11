package design.pattern.status;

import java.util.Random;

public class HasMoneyState implements IState  
{  
  
    private VendingMachineW machine;  
    private Random random = new Random();  
  
    public HasMoneyState(VendingMachineW machine)  
    {  
        this.machine = machine;  
    }  
  
    @Override  
    public void insertMoney()  
    {  
        System.out.println("���Ѿ�Ͷ�����ˣ�������Ͷ....");  
    }  
  
    @Override  
    public void backMoney()  
    {  
        System.out.println("�˱ҳɹ�");  
  
        machine.setState(machine.getNoMoneyState());  
    }  
  
    @Override  
    public void turnCrank()  
    {  
        System.out.println("��ת�����ֱ�");  
        int winner = random.nextInt(10);  
        if (winner == 0 && machine.getCount() > 1)  
        {  
            machine.setState(machine.getWinnerState());  
        } else  
        {  
            machine.setState(machine.getSoldState());  
        }  
    }  
  
    @Override  
    public void dispense()  
    {  
        throw new IllegalStateException("�Ƿ�״̬��");  
    }  
  
} 
