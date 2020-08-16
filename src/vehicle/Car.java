package vehicle;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "type")
		@JsonSubTypes({ 
		  @Type(value = Car.class, name = "car"), 
		  @Type(value = SuperCar.class, name = "super") 
		})

public class Car {

	private int year;
	private String make;
	private String model;
	private int odemeter;
	private double engineSize;
	
	public Car() {
		
	}

	public Car(int year, String make, String model, int odemeter, double engineSize) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.odemeter = odemeter;
		this.engineSize = engineSize;
	}

//	@Override
//	public String toString() {
//		String returnValue = this.year + "," + this.make + "," + this.model + "," + this.odemeter + ","
//				+ this.engineSize;
//		return returnValue;
//
//	}

	@Override
	public String toString() {
		return "Car [year=" + this.year + ", make=" + make + ", model=" + model + ", odemeter=" + odemeter + ", engineSize="
				+ engineSize + "]";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getOdemeter() {
		return odemeter;
	}

	public void setOdemeter(int odemeter) {
		this.odemeter = odemeter;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

}