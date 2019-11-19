/**
 * 
 * @author Chloe Culver and Alex Chheng
 *
 */
public class SimpleObserver implements Observer {
    private int value;
    private Subject simpleSubject;

    /**
     * Empty constructor for class
     */
    public SimpleObserver()
    {
    	
    }
    /**
     * Constructor for class
     * @param simpleSubject
     */
    public SimpleObserver(Subject simpleSubject){
        this.setSimpleSubject(simpleSubject);
        simpleSubject.registerObserver(this);
    }
    /**
     *  Updates the value and then calls the display method
     */
    @Override
    public void update(int value) {
        this.value = value;
        //display();
    }

    /**
     * Prints out the value of the instance of that observer
     */
    public void display() {
        System.out.println("Value: " + value);
    }

    /**
     * 
     * @return returns the simpleSibject;s
     */
	public Subject getSimpleSubject() {
		return simpleSubject;
	}

	/**
	 * Sets the simpleSubject
	 * @param simpleSubject the new value of simpleSubject
	 */
	public void setSimpleSubject(Subject simpleSubject) {
		this.simpleSubject = simpleSubject;
	}
}
