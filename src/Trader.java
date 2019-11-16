public class Trader implements Observer {
    private int value;
    private Subject simpleSubject;

    public Trader(Subject simpleSubject){
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int value) {

    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
