package it.polito.tdp.extflightdelays.model;

public class Adiacenza {
	private int id1;
	private int id2;
	private int distanza;
	
	public Adiacenza(int id1, int id2, int distanza) {
		this.id1 = id1;
		this.id2 = id2;
		this.distanza = distanza;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public int getDistanza() {
		return distanza;
	}

	public void setDistanza(int distanza) {
		this.distanza = distanza;
	}
	
	
}
