package design.pattern.test;

import design.pattern.model.HRWorker;
import design.pattern.model.ITWorker;
import design.pattern.model.ManagerWorker;
import design.pattern.model.QAWorker;
import design.pattern.model.Worker;

public class TestModel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker it1 = new ITWorker("����");  
        it1.workOneDay();  
        Worker it2 = new ITWorker("����");  
        it2.workOneDay();  
        Worker hr = new HRWorker("�ϵ�");  
        hr.workOneDay();  
        Worker qa = new QAWorker("����");  
        qa.workOneDay();  
        Worker pm = new ManagerWorker("�ӻ�");  
        pm.workOneDay();
	}

}
