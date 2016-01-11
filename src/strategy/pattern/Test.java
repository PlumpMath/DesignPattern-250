package strategy.pattern;

public class Test {

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
