import java.util.ArrayList;

public class Stock implements Subject {
    private ArrayList<Observer> observers;
    private int value = 0;

    public Stock(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
    public void notifyObservers() {

    }

    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }
}
