package design.pattern.watcher;

import java.util.Observable;

public class SubjectFor3d extends Observable  
{  
    private String msg ;   
      
      
    public String getMsg()  
    {  
        return msg;  
    }  
  
  
    /** 
     * ���������Ϣ 
     *  
     * @param msg 
     */  
    public void setMsg(String msg)  
    {  
        this.msg = msg  ;  
        setChanged();  
        notifyObservers();  
    }  
}  
