/**
 *  @author Chloe Culver and Alex Chheng
 *  This Class creates stocks that can be sold and bought by the Trader class
 */
import java.util.ArrayList;

public class Stock implements Subject {
    private ArrayList<Observer> observers;
    private int value = 0;
    public String name;
/**
 * Default Constructors
 */
    public Stock(){
        observers = new ArrayList<Observer>();
    }
    /**
     * Constructor
     * @param v
     * @param n
     */
    public Stock(int v, String n){
    	value = v;
    	name = n;
        observers = new ArrayList<Observer>();
    }
    @Override
    /**
     * Adds traders to ArrayList
     */
    public void registerObserver(Observer o) {
    	if(!observers.contains(o.getName()))
    		observers.add(o);
    	
    }
    /**
     * removes observer from list
     */
    @Override
    public void removeObserver(Observer o) {
       observers.remove(o);
    }

    @Override
    /**
     * notifies traders looking at stock that something has changed
     */
    public void notifyObservers() {
    	System.out.println(("....."+ name + " Stocks....."));
        for (Observer observer : observers){
            observer.update(value);
        }
    }
    public void notifyObservers(Observer o) {
    	System.out.println(("....."+ name + " Stocks....."));
        for (Observer observer : observers){
            observer.update((Trader) o,value);
        }
    }
    /**
     * getter for Stock Value
     * @return stock value
     */
    public int getValue() {
    	return value;
    }
    /**
     * Sets value of Stock
     * @param value
     */
    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }
    /**
     * Getter for name of Stock
     * @return Stock name
     */
	public String getName() {
		return name;
	}
	/**
	 * Sets name of Stock
	 * @param name of stock
	 */
	public void setName(String name) {
		this.name = name;
	}
}
