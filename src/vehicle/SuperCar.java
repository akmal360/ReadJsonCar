package vehicle;

public class SuperCar extends Car {

	private int fualOctane;
	private boolean hasThruster;

	public SuperCar() {
		super();
	}

	public SuperCar(int year, String make, String model, int odemeter, double engineSize, int fualOctane,
			boolean hasThruster) {
		super(year, make, model, odemeter, engineSize);
		this.fualOctane = fualOctane;
		this.hasThruster = hasThruster;

	}

	@Override
	public String toString() {
		return "Car [year=" + super.getYear() + ", make=" + super.getMake() + ", model=" + super.getModel()
				+ ", odemeter=" + super.getOdemeter() + ", engineSize=" + super.getEngineSize() + ", Octain = " + fualOctane
				+ ", Thruster = " + hasThruster + "]";
	}

	public int getFualOctane() {
		return fualOctane;
	}

	public void setFualOctane(int fualOctane) {
		this.fualOctane = fualOctane;
	}

	public boolean isHasThruster() {
		return hasThruster;
	}

	public void setHasThruster(boolean hasThruster) {
		this.hasThruster = hasThruster;
	}

}
