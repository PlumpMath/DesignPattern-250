package design.pattern.watcher;


//����ӿڣ����е��������ʵ�ִ˽ӿ� 
public interface Subject  
{  
    /** 
     * ע��һ���۲��� 
     *  
     * @param observer 
     */  
    public void registerObserver(Observer observer);  
  
    /** 
     * �Ƴ�һ���۲��� 
     *  
     * @param observer 
     */  
    public void removeObserver(Observer observer);  
  
    /** 
     * ֪ͨ���еĹ۲��� 
     */  
    public void notifyObservers();  
  
}  