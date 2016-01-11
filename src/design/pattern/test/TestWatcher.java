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
		//ģ��һ��3D�ķ����  
        ObjectFor3D subjectFor3d = new ObjectFor3D();  
        //�ͻ�1  
        Observer observer1 = new Observer1(subjectFor3d);  
        Observer observer2 = new Observer2(subjectFor3d);  
  
        subjectFor3d.setMsg("20140420��3D�����ǣ�127" );  
        subjectFor3d.setMsg("20140421��3D�����ǣ�333" );  
	}

}
