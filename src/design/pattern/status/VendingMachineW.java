package design.pattern.status;

public class VendingMachineW  
{  
    private IState noMoneyState;  
    private IState hasMoneyState;  
    private IState soldState;  
    private IState soldOutState;  
    private IState winnerState ;   
  
    private int count = 0;  
    private IState currentState = noMoneyState;  
  
    public VendingMachineW(int count)  
    {  
        noMoneyState = new NoMoneyState(this);  
        hasMoneyState = new HasMoneyState(this);  
        soldState = new SoldState(this);  
        soldOutState = new SoldOutState(this);  
        winnerState = new WinnerState(this);  
  
        if (count > 0)  
        {  
            this.count = count;  
            currentState = noMoneyState;  
        }  
    }  
  
    public void insertMoney()  
    {  
        currentState.insertMoney();  
    }  
  
    public void backMoney()  
    {  
        currentState.backMoney();  
    }  
  
    public void turnCrank()  
    {  
        currentState.turnCrank();  
        if (currentState == soldState || currentState == winnerState)  
            currentState.dispense();  
    }  
  
    public void dispense()  
    {  
        System.out.println("发出一件商品...");  
        if (count != 0)  
        {  
            count -= 1;  
        }  
    }  
  
    public void setState(IState state)  
    {  
        this.currentState = state;  
    }

	public IState getNoMoneyState() {
		return noMoneyState;
	}

	public void setNoMoneyState(IState noMoneyState) {
		this.noMoneyState = noMoneyState;
	}

	public IState getHasMoneyState() {
		return hasMoneyState;
	}

	public void setHasMoneyState(IState hasMoneyState) {
		this.hasMoneyState = hasMoneyState;
	}

	public IState getSoldState() {
		return soldState;
	}

	public void setSoldState(IState soldState) {
		this.soldState = soldState;
	}

	public IState getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(IState soldOutState) {
		this.soldOutState = soldOutState;
	}

	public IState getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(IState winnerState) {
		this.winnerState = winnerState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}  
  
    //getter setter omitted ...  
  
}  