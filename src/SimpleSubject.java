import java.util.ArrayList;

public class SimpleSubject implements Subject{
    private ArrayList<Observer> observers;
    private int value = 0;
    public SimpleSubject(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        //... add observer to the list
    }

    @Override
    public void removeObserver(Observer o) {
        //.. remove observer from the list
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
}
