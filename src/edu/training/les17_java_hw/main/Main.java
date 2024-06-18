package edu.training.les17_java_hw.main;

import java.util.ArrayList;
import edu.training.les17_java_hw.entity.*;
import edu.training.les17_java_hw.menu.MenuManager;

public class Main {

	public static void main(String[] args) {
	    ArrayList<Train> trains = new ArrayList<>();
	    
	    // создайте данные в массив из пяти элементов типа Train
	    initTrains(trains);

	    Station station = new Station(trains);
	    
	    // сделала вызов меню и выполнение действий в соответствии с введенной цифрой
	    MenuManager menuManager = new MenuManager();
	    menuManager.runMenu(station);
	}


	public static void initTrains(ArrayList<Train> trains) {
		trains.add(new Train("Москва", 123, "08:00"));
		trains.add(new Train("Санкт-Петербург", 456, "10:00"));
		trains.add(new Train("Сочи", 789, "12:00"));
		trains.add(new Train("Калининград", 234, "14:00"));
		trains.add(new Train("Новосибирск", 567, "16:00"));
	}
	
}
