package it.polito.tdp.extflightdelays.db;

import it.polito.tdp.extflightdelays.model.Airport;

public class TestDAO {

	public static void main(String[] args) {

		ExtFlightDelaysDAO dao = new ExtFlightDelaysDAO();

		System.out.println(dao.loadAllAirlines());
		System.out.println(dao.loadAllAirports());
		System.out.println(dao.loadAllFlights().size());
		System.out.println(dao.loadAllAirports().size());
		System.out.println(dao.getVoli().size());
		/*Airport partenza = null;
		Airport arrivo = null;
		for(Airport a:dao.loadAllAirports()) {
			if(a.getAirportName().contains("Chicago"))
				partenza=a;
			if(a.getAirportName().contains("Honolulu"))
				arrivo=a;
		}
		System.out.println(dao.getPeso(partenza, arrivo));*/  //GIUSTO
	}

}
