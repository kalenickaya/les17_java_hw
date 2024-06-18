package edu.training.les17_java_hw.menu;

import java.util.Scanner;
import edu.training.les17_java_hw.entity.*;
import edu.training.les17_java_hw.logic.StationLogic;
import edu.training.les17_java_hw.presentation.StationView;

public class MenuManager {
	
	public void runMenu(Station station) {
		StationLogic logic = new StationLogic();
		StationView view = new StationView();
		
		Scanner scanner = new Scanner(System.in);
		int action = 0;
		
		while (action != 5) {
            System.out.println(buildMenu());
            System.out.print("> ");

            if (scanner.hasNextInt()) {
                action = scanner.nextInt();

                switch (action) {
                // возможность вывода информации о всех поездах
                case 1:
            	    view.printInfoForAllTrains(station);
                    break;
                // добавьте возможность вывода информации о поезде, номер которого введен пользователем
                case 2:
                    boolean validInput = false;
                    System.out.print("Введите номер поезда для вывода информации о нем:\n> ");
                    while (!validInput) {
                        
                        if (scanner.hasNextInt()) {
                            int trainNumberToFind = scanner.nextInt();
                            Train foundTrain = logic.findTrainByNumber(station, trainNumberToFind);
                    	    view.printTrainInfo(foundTrain);
                            validInput = true;
                        } else {
                            System.out.print("Ошибка ввода. Пожалуйста, введите целое число.\n> ");
                            scanner.next();
                        }
                    }
                    break;
            	// добавьте возможность сортировки элементов массива по номерам поездов
                case 3:
                	logic.sortByTrainNumbers(station);
                	System.out.println("Список поездов отсортирован по номерам.\n");
                    break;
                // добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
            	// быть упорядочены по времени отправления
                case 4:
					logic.sortByDestinationAndDepartureTime(station);
					System.out.println("Список поездов отсортирован по месту назначения и времени отправления.\n");
					break;
				case 5:
					System.out.print("Хорошего дня! :)");
					break;
				default:
					System.out.println("Ошибка ввода.\n");
				}
			} else {
				System.out.println("Ошибка ввода.\n");
				scanner.next();
			}
		}
		scanner.close();
	}
	
	private StringBuilder buildMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Введите:\n")
        .append("1 - чтобы вывести информацию о всех поездах.\n")
        .append("2 - чтобы вывести информацию о поезде по его номеру.\n")
        .append("3 - чтобы отсортировать поезда по их номерам.\n")
        .append("4 - чтобы отсортировать поезда по пункту назначения и времени отправления.\n")
        .append("5 - чтобы завершить выполнение программы.\n");
        return menu;
    }

}
