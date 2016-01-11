package design.pattern.test;

import design.pattern.adapter.IV5Power;
import design.pattern.adapter.Mobile;
import design.pattern.adapter.V220Power;
import design.pattern.adapter.V5PowerAdapter;

public class TestAdapter {
	public static void main(String[] args)  
    {  
        Mobile mobile = new Mobile();  
        IV5Power v5Power = new V5PowerAdapter(new V220Power()) ;   
        mobile.inputPower(v5Power);  
    } 
}
