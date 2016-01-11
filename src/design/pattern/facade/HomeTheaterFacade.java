package design.pattern.facade;

public class HomeTheaterFacade  
{  
    private Computer computer;  
    private Player player;  
    private Light light;  
    private Projector projector;  
    private PopcornPopper popper;  
  
    public HomeTheaterFacade(Computer computer, Player player, Light light, Projector projector, PopcornPopper popper)  
    {  
        this.computer = computer;  
        this.player = player;  
        this.light = light;  
        this.projector = projector;  
        this.popper = popper;  
    }  
  
    public void watchMovie()  
    {  
        /** 
         *  1���򿪱��׻��� 
            2���������׻� 
            3�����ƹ���� 
            4����ͶӰ�� 
            5������ͶӰ��ͶӰ�� 
            6���򿪵��� 
            7���򿪲����� 
            8����������������Ϊ���������� 
         */  
        popper.on();  
        popper.makePopcorn();  
        light.down();  
        projector.on();  
        projector.open();  
        computer.on();  
        player.on();  
        player.make3DListener();  
    }  
      
    public void stopMovie()  
    {  
        popper.off();  
        popper.stopMakePopcorn();  
        light.up();  
        projector.close();  
        projector.off();  
        player.off();  
        computer.off();  
    }  
}  
