package it.polito.tdp.extflightdelays.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.extflightdelays.db.ExtFlightDelaysDAO;

public class Model {
	
	private ExtFlightDelaysDAO dao;
	private Graph<Airport, DefaultWeightedEdge> grafo;
	private Map<Integer, Airport> idMap;
	
	public Model() {
		dao= new ExtFlightDelaysDAO();
		idMap= new HashMap<Integer,Airport>();
	}
	
	public void creaGrafo(int distanzaMedia) {
		grafo= new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		dao.loadAllAirports(idMap);
		Graphs.addAllVertices(grafo, idMap.values());
		for(Adiacenza a: dao.getVoli()) {
			if(a.getDistanza()>=distanzaMedia)
				Graphs.addEdge(this.grafo, idMap.get(a.getId1()), idMap.get(a.getId2()), a.getDistanza());
		}		
	}

	public Graph<Airport, DefaultWeightedEdge> getGrafo() {
		return grafo;
	}
	
	
	
	

}
