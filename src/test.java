/**
 * 
 * @author Chloe Culver and Alex Chheng
 *
 */
public class test {
    public static void main(String[] args) {
        Stock stock = new Stock(234, "COCA");
        Trader t1 = new Trader(stock, "Hanson");
        Trader t2 = new Trader(stock, "Dylan");
        Trader t3 = new Trader(stock, "Joe");

        stock.registerObserver(t1);
        stock.registerObserver(t2);
        stock.registerObserver(t3);

        stock.notifyObservers();
        stock.setValue(230);
        stock.notifyObservers();
    }
}
