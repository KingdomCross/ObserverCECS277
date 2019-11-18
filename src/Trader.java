/**
 * 
 * @author Chloe Culver and Alex Chheng
 *
 */
public class Trader implements Observer {
    private Stock trader;
    private String name;
    private String action = "";
    private boolean buy;

    public Trader(Stock trader){
        this.setTrader(trader);
        trader.registerObserver(this);
    }
    public Trader(Stock trader,String n)
    {
    	setName(n);
    	 this.setTrader(trader);
         trader.registerObserver(this);
    }

    @Override
    public void update(int value) {
    	System.out.println("The latest trade is Trader:" + name + action +  " $ " + value + " Stock: " + trader.getName());
    		
    }
    public void setAction()
    {
    	if(buy)
    	{
    		action = "buy";
    	}
    	else {
    		action = "sell";
    	}
    }

	public Subject getTrader() {
		return trader;
	}

	public void setTrader(Stock trader) {
		this.trader = trader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
