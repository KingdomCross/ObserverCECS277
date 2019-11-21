/**
 * 
 * @author Chloe Culver and Alex Chheng
 * This class Creates the traders for Stocks 
 *
 */
public class Trader implements Observer {
    private Stock trader;
    private String name;
    private String action = " has";
    
    /**
     * Class Constructor 
     * @param trader
     */
    public Trader(Stock trader){
        this.setTrader(trader);
        trader.registerObserver(this);
    }
    /**
     * Class Constructor
     * @param trader
     * @param n
     */
    public Trader(Stock trader,String n)
    {
    	setName(n);
    	 setTrader(trader);
         trader.registerObserver(this);
    }
    /**
     * Updates all the traders apart of a specific stock
     */
    @Override
    public void update(int value) {
    	System.out.println(" The latest trade is Trader: " + name + action +  " $ " + trader.getValue() + " Stock: " + trader.getName());
    		
    }
    /**
     *  Updates all the traders apart of a specific stock
     */
	@Override
	public void update(Trader t, int value) {
		// TODO Auto-generated method stub
		System.out.println(" The latest trade is Trader: " + t.name + t.action +  " $ " + t.trader.getValue() + " Stock: " + t.trader.getName());
	}
	public String toString()
	{
		String info =" The latest trade is Trader: " + name + action +  " $ " + trader.getValue() + " Stock: " + trader.getName();
		return info;
	}

    /**
     * buy method for Traders
     */
    public void buy(Stock trader) 
    {
    	action = " buy";
    	setTrader(trader);
    	trader.registerObserver(this);
    	trader.notifyObservers(this);
    }
    /**
     * Sells stock for traders
     * @param t
     */
    public void sell(Stock trader) 
    {
    	
    	action = " sell";
    	//setTrader(trader);
    	trader.notifyObservers(this);
    	trader.removeObserver(this);
    
    	
    }

	public Subject getTrader() {
		return trader;
	}
	/**
	 * sets Trader
	 * @param trader
	 */
	public void setTrader(Stock trader) {
		this.trader = trader;
	}
	/**
	 * getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * sets Name of Trader
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}



}
