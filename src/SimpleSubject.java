import java.util.ArrayList;

public class SimpleSubject implements Subject{
    private ArrayList<Observer> observers;
    private int value = 0;
    public SimpleSubject(){
        observers = new ArrayList<Observer>();
    }
    /**
     * adds observer to ArrayList
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    /**
     * removes observer from list
     * @param Oberver o  the item being removed
     */
    @Override
    public void removeObserver(Observer o) {
        //.. remove observer from the list
    	observers.remove(o);
    }

    /**
     * updates observer in the list
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(value);
        }
    }
    /**
     * Sets value and then updates observer
     * @param value
     */
    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }
}
