package design.pattern.test;

import design.pattern.command.ICommand;
import design.pattern.command.Computer;
import design.pattern.command.ComputerOffCommond;
import design.pattern.command.ComputerOnCommond;
import design.pattern.command.ControlPanel;
import design.pattern.command.Door;
import design.pattern.command.DoorOffCommond;
import design.pattern.command.DoorOnCommond;
import design.pattern.command.Light;
import design.pattern.command.LightOffCommond;
import design.pattern.command.LightOnCommond;
import design.pattern.command.QuickCommand;

public class TestCommand {

	public static void main(String[] args)  
    {  
        /** 
         * �����ҵ� 
         */  
        Light light = new Light();  
        Door door = new Door();  
        Computer computer = new Computer();  
        /** 
         * һ�������������������ǵ�app������ 
         */  
        ControlPanel controlPanel = new ControlPanel();  
        // Ϊÿ����ť���ù���  
        controlPanel.setCommand(0, new LightOnCommond(light));  
        controlPanel.setCommand(1, new LightOffCommond(light));  
        controlPanel.setCommand(2, new ComputerOnCommond(computer));  
        controlPanel.setCommand(3, new ComputerOffCommond(computer));  
        controlPanel.setCommand(4, new DoorOnCommond(door));  
        controlPanel.setCommand(5, new DoorOffCommond(door));  
  
        // ģ����  
        controlPanel.keyPressed(0);  
        controlPanel.keyPressed(2);  
        controlPanel.keyPressed(3);  
        controlPanel.keyPressed(4);  
        controlPanel.keyPressed(5);  
        controlPanel.keyPressed(8);// ���û��ָ�������ǲ�����κ����⣬���ǵ�NoCommand�Ĺ���  
  
     // ����һ���㶨ģʽ  
        QuickCommand quickCommand = new QuickCommand(new ICommand[] { new DoorOffCommond(door),  
                new LightOffCommond(light), new ComputerOnCommond(computer) });  
        System.out.println("****���һ���㶨��ť****");  
        controlPanel.setCommand(8, quickCommand);  
        controlPanel.keyPressed(8);  
  
    }  

}
