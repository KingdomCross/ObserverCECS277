/**
 * 
 * @author Chloe Culver and Alex Chheng
 *
 */
public class Trader implements Observer {
    private Stock trader;
    private String name;
    private String action = "";
    
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
    	 this.setTrader(trader);
         trader.registerObserver(this);
    }
    /**
     * Updates all the traders apart of a specific stock
     */
    @Override
    public void update(int value) {
    	System.out.println("The latest trade is Trader: " + name + action +  " $ " + trader.getValue() + " Stock: " + trader.getName());
    		
    }
    /**
     * Displays the stock, trader's name, and the price of stock
     */
    public void display()
    {
    	System.out.println(name + " has Stock: " + trader.getName() + " at value: " + trader.getValue());
    }
    /**
     * buy method for Traders
     */
    public void buy(Stock trader) 
    {
    	action = " buy";
    	setTrader(trader);
    	
    }
    /**
     * Sells stock for traders
     * @param t
     */
    public void sell(Stock trader) 
    {
    	
    	action = " sell";
    	setTrader(trader);
    	
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
