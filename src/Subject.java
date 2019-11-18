/**
 * 
 * @author Chloe Culver and Alex Chheng
 *
 */
//https://www.linkedin.com/learning/programming-foundations-design-patterns-2/understanding-the-observer-pattern?u=42458916
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    void notifyObservers();
}
