package edu.training.les17_java_hw.entity;

import java.util.List;
import java.util.Objects;

public class Station {

	private List<Train> trains;
	
	public Station() {}
	
	public Station(List<Train> trains) {
		this.trains = trains;
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
	public void addTrain(Train train) {
		trains.add(train);
	}

	@Override
	public int hashCode() {
		return Objects.hash(trains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Station other = (Station) obj;
		return Objects.equals(trains, other.trains);
	}
	
}