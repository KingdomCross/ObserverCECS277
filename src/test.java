/**
 * 
 * @author Chloe Culver and Alex Chheng
 *
 */
public class test {
    public static void main(String[] args) {
        Stock stock = new Stock(234, "COCA");
        Stock s2 = new Stock(150, "APPL");
        Stock s3 = new Stock(567, "GOOG");
        Trader t1 = new Trader(stock, "Hanson");
        Trader t2 = new Trader(stock, "Dylan");
        Trader t3 = new Trader(stock, "Joe");
        //adding Traders to Stocks
        s3.registerObserver(t1);
        s3.registerObserver(t2);
        s3.registerObserver(t3);
      //adding Traders to Stocks
        s2.registerObserver(t1);
        s2.registerObserver(t2);
        s2.registerObserver(t3);
      //adding Traders to Stocks
        stock.registerObserver(t1);
        stock.registerObserver(t2);
        stock.registerObserver(t3);
        
        System.out.println(".....Trading Stocks.....");
        t1.buy(s3);
        t2.sell(stock);
        t3.buy(s2);
        t3.sell(stock);
        stock.notifyObservers();
        s2.notifyObservers();
        s3.notifyObservers();
    }
}
