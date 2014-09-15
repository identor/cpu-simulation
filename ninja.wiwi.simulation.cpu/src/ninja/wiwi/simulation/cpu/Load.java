package ninja.wiwi.simulation.cpu;

import java.io.Serializable;

public class Load implements Serializable {

	/**
	 * Auto-generated serial version ID.
	 */
	private static final long serialVersionUID = 8189018485547041069L;

	private String id;
	private int load;
	private int arrival;

	public Load(String id, int load, int arrival) {
		this.id = id;
		this.load = load;
		this.arrival = arrival;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLoad() {
		return load;
	}
	public void setLoad(int load) {
		this.load = load;
	}
	public int getArrival() {
		return arrival;
	}
	public void setArrival(int arrival) {
		this.arrival = arrival;
	}
}
