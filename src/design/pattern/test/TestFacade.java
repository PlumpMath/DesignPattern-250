package design.pattern.test;

import design.pattern.facade.Computer;
import design.pattern.facade.HomeTheaterFacade;
import design.pattern.facade.Light;
import design.pattern.facade.Player;
import design.pattern.facade.PopcornPopper;
import design.pattern.facade.Projector;

public class TestFacade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		Player player = new Player();
		Light light = new Light();
		Projector projector = new Projector();
		PopcornPopper popper = new PopcornPopper();
		// TODO Auto-generated method stub
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(computer, player, light, projector, popper);
		
		homeTheaterFacade.watchMovie();
		
		homeTheaterFacade.stopMovie();
	}

}
