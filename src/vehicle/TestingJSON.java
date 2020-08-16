package vehicle;

import java.util.ArrayList;

public class TestingJSON {

	public static void main(String[] args) {
		Car c1 = new Car(2020, "Nissan", "CRV7", 34000, 2.5d);
		Car c2 = new Car(2021, "Nissan", "CRV3", 34000, 3.5d);
		Car c3 = new Car(2022, "Nissan", "CRV1", 34000, 4.5d);
		Car c4 = new Car(2023, "Nissan", "CRV4", 34000, 5.5d);
		Car c5 = new Car(2024, "Nissan", "CRV5", 34000, 6.5d);
		Car c6 = new Car(2025, "Nissan", "CRV3", 34000, 7.5d);

		SuperCar sp = new SuperCar(2025, "Nissan", "CRV3", 34000, 7.5, 111, true);
		

		ArrayList<Car> carArrayList = new ArrayList<Car>();
		carArrayList.add(c1);
		carArrayList.add(c2);
		carArrayList.add(c3);
		carArrayList.add(c4);
		carArrayList.add(c5);
		carArrayList.add(c6);
		carArrayList.add(sp);

		CarsList carsList = new CarsList();
		carsList.setCarList(carArrayList);

		DataManagement dm = new DataManagement();
		dm.writeAllData(carsList);

		CarsList readCarsList = new CarsList();
		readCarsList = dm.readAllData();
		System.out.println("The list of JSON file is : " + readCarsList.getCarList().toString());
		System.out.println("The Index value : " + readCarsList.getCarList().get(2));

	}

}
