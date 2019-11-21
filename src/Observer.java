/**
 * 
 * @author Chloe Culver and Alex Chheng
 *
 */
public interface Observer {
    public String getName();
	void update(Trader t, int value);
	public void update(int value);
}
