/**
 *  @author Chloe Culver and Alex Chheng
 */
import java.util.ArrayList;

public class Stock implements Subject {
    private ArrayList<Observer> observers;
    private int value = 0;
    public String name;

    public Stock(){
        observers = new ArrayList<Observer>();
    }

    public Stock(int v, String n){
    	value = v;
    	name = n;
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(value);
        }
    }

    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
