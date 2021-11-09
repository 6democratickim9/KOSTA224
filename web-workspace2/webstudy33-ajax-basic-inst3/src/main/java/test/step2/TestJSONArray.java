package test.step2;

import java.util.ArrayList;

import org.json.JSONArray;

import model.CarDAO;
import model.CarDTO;

public class TestJSONArray {
	public static void main(String[] args) {
		JSONArray ja = new JSONArray();
		ja.put("김밥");
		ja.put("라면");
		ja.put("아이스아메리카노");
		ja.put("돈까스");
		System.out.println(ja.toString());
		ArrayList<CarDTO> list=CarDAO.getInstance().getCarList("현대");
	}

}
