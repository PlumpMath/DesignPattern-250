package design.pattern.test;

import design.pattern.status.VendingMachineW;

public class TestTraW {

	public static void main(String[] args)  
    {  
        VendingMachineW machine = new VendingMachineW(10);  
        machine.insertMoney();  
        machine.backMoney();  
  
        System.out.println("----��Ҫ�н�----");  
  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
        machine.insertMoney();  
        machine.turnCrank();  
  
        System.out.println("-------ѹ������------");  
  
        machine.insertMoney();  
        machine.backMoney();  
        machine.backMoney();  
        machine.turnCrank();// ��Ч����  
        machine.turnCrank();// ��Ч����  
        machine.backMoney();  
  
    }  

}
