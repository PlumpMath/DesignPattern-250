package design.pattern.status;

public interface IState  
{  
    /** 
     * ��Ǯ 
     */  
    public void insertMoney();  
    /** 
     * ��Ǯ 
     */  
    public void backMoney();  
    /** 
     * ת������ 
     */  
    public void turnCrank();  
    /** 
     * ����Ʒ 
     */  
    public void dispense();  
}  