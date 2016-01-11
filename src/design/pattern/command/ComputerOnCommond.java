package design.pattern.command;

public class ComputerOnCommond implements ICommand  
{  
    private Computer computer ;   
      
    public ComputerOnCommond( Computer computer)  
    {  
        this.computer = computer;  
    }  
  
    @Override  
    public void execute()  
    {  
        computer.on();  
    }  
  
}  
