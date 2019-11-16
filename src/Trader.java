public class Trader implements Observer {
    private int value;
    private Subject trader;

    public Trader(Subject trader){
        this.trader = trader;
        trader.registerObserver(this);
    }

    @Override
    public void update(int value) {

    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
