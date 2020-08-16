package vehicle;

import java.util.ArrayList;
import java.util.List;

public class CarsList {

	private List<Car> carList = new ArrayList<Car>();
//
//	public CarsList() {
//		this.carList = new ArrayList<Car>();
//	}
//
//	public CarsList(List<Car> carList) {
//		super();
//		this.carList = carList;
//	}
//
//	public List<Car> getCarList() {
//		return carList;
//	}
//
//	public void setCarList(List<Car> carList) {
//		this.carList = carList;
//	}

	public CarsList() {
		this.carList=new ArrayList<Car>();
	}
	
	public List<Car> getCarList() {
		return carList;
	}

	public CarsList(List<Car> carList) {
		super();
		this.carList = carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

}
