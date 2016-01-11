package design.pattern.test;

import design.pattern.watcher.ObjectFor3D;
import design.pattern.watcher.Observer;
import design.pattern.watcher.Observer1;
import design.pattern.watcher.Observer2;

public class TestWatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//模拟一个3D的服务号  
        ObjectFor3D subjectFor3d = new ObjectFor3D();  
        //客户1  
        Observer observer1 = new Observer1(subjectFor3d);  
        Observer observer2 = new Observer2(subjectFor3d);  
  
        subjectFor3d.setMsg("20140420的3D号码是：127" );  
        subjectFor3d.setMsg("20140421的3D号码是：333" );  
	}

}
