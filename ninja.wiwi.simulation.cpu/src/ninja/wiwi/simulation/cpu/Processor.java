package ninja.wiwi.simulation.cpu;

import java.io.Serializable;
import java.util.Stack;

public class Processor implements Serializable {

	/**
	 * Auto-generated serial version ID.
	 */
	private static final long serialVersionUID = 2880980101942128936L;
	
	private String id;
	private boolean isActive;
	private Load load;
	private int loadProcessed;
	private int timeActive;
	private Stack<Process> finished;
	
	public Processor(String id) {
		this.id = id;
		this.isActive = false;
		this.load = null;
		this.loadProcessed = 0;
		this.timeActive = 0;
		this.finished = new Stack<>();
	}
	
	public void setProcess(Load load) {
		this.load = load;
		this.isActive = load != null;
	}
	
	public Load getLoad() {
		return this.load;
	}

	public String getId() {
		return this.id;
	}
	
	public boolean isActive() {
		if (this.load != null) {
			loadProcessed++;
		}
        return this.isActive;
	}
	
	public Stack<Process> getFinished() {
		return this.finished;
	}
	
	public void addTimeActive() {
		this.timeActive++;
	}
	
	public int getTimeActive() {
		return this.timeActive;
	}
	
	public int getLoadProcessed() {
		return this.loadProcessed;
	}
}