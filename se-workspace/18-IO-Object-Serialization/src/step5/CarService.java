package step5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CarService {
	private String path;

	public CarService(String path) {
		super();
		this.path = path;
	}
	public void saveList(ArrayList<Car> list)throws FileNotFoundException,IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOtputStream(new FileOutputStream(path));
			oos.writeObject(list);
		}finally {
			if(oos!=null)
				oos.close();
			
		}
	}
}
