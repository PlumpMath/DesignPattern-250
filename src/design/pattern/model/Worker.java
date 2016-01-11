package design.pattern.model;

import java.util.Date;

public abstract class Worker  
{  
    protected String name;  
  
    public Worker(String name)  
    {  
        this.name = name;  
    }  
  
    /** 
     * ��¼һ��Ĺ��� 
     */  
    public final void workOneDay()  
    {  
  
        System.out.println("-----------------work start ---------------");  
        enterCompany();  
        computerOn();  
        work();  
        computerOff();  
        exitCompany();  
        System.out.println("-----------------work end ---------------");  
  
    }  
  
    /** 
     * ���� 
     */  
    public abstract void work();  
  
    /** 
     * �رյ��� 
     */  
    private void computerOff()  
    {  
        System.out.println(name + "�رյ���");  
    }  
  
    /** 
     * �򿪵��� 
     */  
    private void computerOn()  
    {  
        System.out.println(name + "�򿪵���");  
    }  
  
    /** 
     * ���빫˾ 
     */  
    public void enterCompany()  
    {  
        System.out.println(name + "���빫˾");  
    }  
    public boolean isNeedPrintDate()  
    {  
        return false;  
    } 
    /** 
     * �뿪��˾ 
     */  
    public void exitCompany()  
    {  
    	if (isNeedPrintDate())  
        {  
            System.out.print(new Date().toLocaleString()+"-->");  
        }  
        System.out.println(name + "�뿪��˾");  
    }  
  
} 
