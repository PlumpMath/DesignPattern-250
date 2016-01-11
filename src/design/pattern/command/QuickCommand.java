package design.pattern.command;

public class QuickCommand implements ICommand  
{  
    private ICommand[] commands;  
  
    public QuickCommand(ICommand[] commands)  
    {  
        this.commands = commands;  
    }  
  
    @Override  
    public void execute()  
    {  
        for (int i = 0; i < commands.length; i++)  
        {  
            commands[i].execute();  
        }  
    }  
}
