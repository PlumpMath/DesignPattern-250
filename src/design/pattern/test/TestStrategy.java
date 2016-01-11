package design.pattern.test;

import design.pattern.strategy.AttackJY;
import design.pattern.strategy.DefendTBS;
import design.pattern.strategy.Display1;
import design.pattern.strategy.Role;
import design.pattern.strategy.RoleA;
import design.pattern.strategy.RunJCTQ;

public class TestStrategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role roleA = new RoleA("A");  
		  
        roleA.setAttackBehavior(new AttackJY())//  
                .setDefendBehavior(new DefendTBS())//  
                .setDisplayBehavior(new Display1())//  
                .setRunBehavior(new RunJCTQ());  
        System.out.println(roleA.name + ":");  
        roleA.run();  
        roleA.attack();  
        roleA.defend();  
        roleA.display();  
	}

}
