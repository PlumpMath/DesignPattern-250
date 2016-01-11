package design.pattern.command;

public class ControlPanel  
{  
    private static final int CONTROL_SIZE = 9;  
    private ICommand[] commands;  
  
    public ControlPanel()  
    {  
        commands = new ICommand[CONTROL_SIZE];  
        /** 
         * ��ʼ�����а�ťָ��ն��� 
         */  
        for (int i = 0; i < CONTROL_SIZE; i++)  
        {  
            commands[i] = new NoCommand();  
        }  
    }  
  
    /** 
     * ����ÿ����ť��Ӧ������ 
     * @param index 
     * @param command 
     */  
    public void setCommand(int index, ICommand command)  
    {  
        commands[index] = command;  
    }  
  
    /** 
     * ģ������ť 
     * @param index 
     */  
    public void keyPressed(int index)  
    {  
        commands[index].execute();  
    }  
  
} 
