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
        System.out.println("\t\t.....Trading Stocks.....");
        Hanson.sell(COCO);
        Hanson.buy(APPL);
        Dylan.buy(GOOG);
        Joe.buy(GOOG);
        Joe.buy(COCO);
    }
}
