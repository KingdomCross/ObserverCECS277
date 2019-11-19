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
        Trader Hanson = new Trader(stock, "Hanson");
        Trader Dylan = new Trader(s2, "Dylan");
        Trader Joe = new Trader(s3, "Joe");
        //adding Traders to Stocks
        s3.registerObserver(Hanson);
        s3.registerObserver(Dylan);
      //adding Traders to Stocks
        s2.registerObserver(Joe);
      //adding Traders to Stocks
        stock.registerObserver(Hanson);
        stock.registerObserver(Dylan);
        stock.registerObserver(Joe);
        
        System.out.println(".....Trading Stocks.....");
        Hanson.sell();
        stock.removeObserver(Hanson);
        Dylan.sell();
        Joe.buy();
        Joe.sell();
        stock.removeObserver(Joe);
        stock.notifyObservers();
        s2.notifyObservers();
        s3.notifyObservers();

    }
}
