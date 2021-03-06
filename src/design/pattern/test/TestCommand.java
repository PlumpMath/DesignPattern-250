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
         * 三个家电 
         */  
        Light light = new Light();  
        Door door = new Door();  
        Computer computer = new Computer();  
        /** 
         * 一个控制器，假设是我们的app主界面 
         */  
        ControlPanel controlPanel = new ControlPanel();  
        // 为每个按钮设置功能  
        controlPanel.setCommand(0, new LightOnCommond(light));  
        controlPanel.setCommand(1, new LightOffCommond(light));  
        controlPanel.setCommand(2, new ComputerOnCommond(computer));  
        controlPanel.setCommand(3, new ComputerOffCommond(computer));  
        controlPanel.setCommand(4, new DoorOnCommond(door));  
        controlPanel.setCommand(5, new DoorOffCommond(door));  
  
        // 模拟点击  
        controlPanel.keyPressed(0);  
        controlPanel.keyPressed(2);  
        controlPanel.keyPressed(3);  
        controlPanel.keyPressed(4);  
        controlPanel.keyPressed(5);  
        controlPanel.keyPressed(8);// 这个没有指定，但是不会出任何问题，我们的NoCommand的功劳  
  
     // 定义一键搞定模式  
        QuickCommand quickCommand = new QuickCommand(new ICommand[] { new DoorOffCommond(door),  
                new LightOffCommond(light), new ComputerOnCommond(computer) });  
        System.out.println("****点击一键搞定按钮****");  
        controlPanel.setCommand(8, quickCommand);  
        controlPanel.keyPressed(8);  
  
    }  

}
