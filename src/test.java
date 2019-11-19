/**
 * 
 * @author Chloe Culver and Alex Chheng
 *
 */
public class test {
    public static void main(String[] args) {
        Stock COCO = new Stock(234, "COCA");
        Stock APPL = new Stock(150, "APPL");
        Stock GOOG = new Stock(567, "GOOG");
        Trader Hanson = new Trader(COCO, "Hanson");
        Trader Dylan = new Trader(GOOG, "Dylan");
        Trader Joe = new Trader(APPL, "Joe");
        //adding Traders to Stocks
        APPL.registerObserver(Hanson);
        APPL.registerObserver(Dylan);
      //adding Traders to Stocks
        GOOG.registerObserver(Joe);
      //adding Traders to Stocks
        COCO.registerObserver(Hanson);
        COCO.registerObserver(Dylan);
        COCO.registerObserver(Joe);
        
        System.out.println(".....Trading Stocks.....");
        Hanson.sell(COCO);
        COCO.removeObserver(Hanson);
        Dylan.sell(GOOG);
        GOOG.removeObserver(Dylan);
        Joe.buy(COCO);
        COCO.registerObserver(Joe);
        Joe.sell(APPL);
        APPL.removeObserver(Joe);
        COCO.notifyObservers();
        GOOG.notifyObservers();
        APPL.notifyObservers();

    }
}
