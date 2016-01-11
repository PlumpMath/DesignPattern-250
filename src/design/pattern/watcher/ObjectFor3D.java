package design.pattern.watcher;

import java.util.ArrayList;
import java.util.List;

public class ObjectFor3D implements Subject  
{  
    private List<Observer> observers = new ArrayList<Observer>();  
    /** 
     * 3D��Ʊ�ĺ��� 
     */  
    private String msg;  
  
    /** 
     * ���������Ϣ 
     *  
     * @param msg 
     */  
    public void setMsg(String msg)  
    {  
        this.msg = msg;  
          
        notifyObservers();  
    }

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		 observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(observer);  
        if (index >= 0)  
        {  
            observers.remove(index);  
        } 
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers)  
        {  
            observer.update(msg);  
        }  
	}  
  
}  
