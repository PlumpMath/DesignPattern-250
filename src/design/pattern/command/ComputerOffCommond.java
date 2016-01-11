package design.pattern.command;

public class ComputerOffCommond implements ICommand  
{  
    private Computer computer ;   
      
    public ComputerOffCommond( Computer computer)  
    {  
        this.computer = computer;  
    }  
  
    @Override  
    public void execute()  
    {  
        computer.off();  
    }  
      
      
  
}  
