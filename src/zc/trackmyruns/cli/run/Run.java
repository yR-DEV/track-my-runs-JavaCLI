package zc.trackmyruns.cli.run;

public class Run {

	private int id;
	private double distance;
	private String description;
	
	public Run(int id, double distance, String description) {
		this.id = id;
		this.distance = distance;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Run [id=" + id + ", distance=" + distance + ", description=" + description + "]";
	}	
}
