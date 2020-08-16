package vehicle;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataManagement {

	public CarsList readAllData() {
		CarsList carList=new CarsList();
		try {
			carList=new ObjectMapper().readerFor(CarsList.class).readValue(new File("cars.json"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return carList;
	}

	public void writeAllData(CarsList theCarsList) {
		ObjectMapper objMap = new ObjectMapper();
		
		try {
			objMap.writerWithDefaultPrettyPrinter().writeValue(new File("cars.json"), theCarsList);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
