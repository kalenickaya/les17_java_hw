package edu.training.les17_java_hw.presentation;

import java.util.List;
import edu.training.les17_java_hw.entity.*;

public class StationView {

	// вывод информации о конкретном поезде
	public void printTrainInfo(Train train) {
		StringBuilder report = new StringBuilder();
		report.append("-----------------------------\n")
		.append("Номер поезда: ")
		.append(train.getTrainNumber())
		.append("\n")
		.append("Пункт назначения: ")
		.append(train.getDestination())
		.append("\n")
		.append("Время отправления: ")
		.append(train.getDepartureTime())
		.append("\n")
		.append("-----------------------------")
		.append("\n");
		System.out.println(report);
	}
	
	// вывод информации о всех поездах
	public void printInfoForAllTrains(Station station) {
		List<Train> trains = station.getTrains();
		StringBuilder report = new StringBuilder();
		report.append("-----------------------------");
		for (Train train : trains) {
			report.append("\n")
			.append("Номер поезда: ")
			.append(train.getTrainNumber())
			.append("\n")
			.append("Пункт назначения: ")
			.append(train.getDestination())
			.append("\n")
			.append("Время отправления: ")
			.append(train.getDepartureTime())
			.append("\n")
			.append("-----------------------------");
		}
		report.append("\n");
		System.out.println(report);
	}
	
}
