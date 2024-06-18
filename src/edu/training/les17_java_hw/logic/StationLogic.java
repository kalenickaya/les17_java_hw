package edu.training.les17_java_hw.logic;

import java.util.List;
import edu.training.les17_java_hw.entity.*;

public class StationLogic {
	
	// поиск поезда по его номеру
	public Train findTrainByNumber(Station station, int trainNumberToFind) {
		List<Train> trains = station.getTrains();
		for (Train train : trains) {
			if (trainNumberToFind == train.getTrainNumber()) {
				return train;
			}
		}
		return null;
	}

	// сортировка элементов массива по номерам поездов
	public void sortByTrainNumbers(Station station) {
		List<Train> trains = station.getTrains();
	    for (int i = 0; i < trains.size() - 1; i++) {
	        for (int j = 0; j < trains.size() - i - 1; j++) {
	            if (trains.get(j).getTrainNumber() > trains.get(j + 1).getTrainNumber()) {
	                Train temp = trains.get(j);
	                trains.set(j, trains.get(j + 1));
	                trains.set(j + 1, temp);
	            }
	        }
	    }
	}
	
	// сортировка массива по пункту назначения и времени отправления
	public void sortByDestinationAndDepartureTime(Station station) {
		List<Train> trains = station.getTrains();
	    for (int i = 1; i < trains.size(); i++) {
	        Train key = trains.get(i);
	        int j = i - 1;

	        while (j >= 0 && (trains.get(j).getDestination().compareTo(key.getDestination()) > 0 ||
	                (trains.get(j).getDestination().equals(key.getDestination()) &&
	                        trains.get(j).getDepartureTime().compareTo(key.getDepartureTime()) > 0))) {
	            trains.set(j + 1, trains.get(j));
	            j = j - 1;
	        }
	        trains.set(j + 1, key);
	    }
	}
	
}
