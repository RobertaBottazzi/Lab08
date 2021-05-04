package it.polito.tdp.extflightdelays.model;

import java.util.HashMap;
import java.util.Map;

import it.polito.tdp.extflightdelays.db.ExtFlightDelaysDAO;



public class TestModel {

	public static void main(String[] args) {
		//ExtFlightDelaysDAO dao= new ExtFlightDelaysDAO();
		Model model = new Model();
		model.creaGrafo(3500);
		/*Map<Integer,Airport> map= new HashMap<Integer,Airport>();
		dao.loadAllAirports(map);
		System.out.println(map);*/
		
	}

}
