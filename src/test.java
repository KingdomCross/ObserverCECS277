public class test {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.notifyObservers();
        System.out.println("Hello Kitty");
        Trader trader = new Trader(stock);
        trader.display();
    }
}
