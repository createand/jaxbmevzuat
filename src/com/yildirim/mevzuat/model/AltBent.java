package com.yildirim.mevzuat.model;

public class AltBent {

	private String altBentIcerik;
	private String altBentAdi;
	
	public AltBent() {
		super();
	}
	public AltBent(String altBentIcerik, String altBentAdi) {
		this.altBentIcerik = altBentIcerik;
		this.altBentAdi = altBentAdi;
	}
	public String getAltBentIcerik() {
		return altBentIcerik;
	}
	public void setAltBentIcerik(String altBentIcerik) {
		this.altBentIcerik = altBentIcerik;
	}
	public String getAltBentAdi() {
		return altBentAdi;
	}
	public void setAltBentAdi(String altBentAdi) {
		this.altBentAdi = altBentAdi;
	}
}
