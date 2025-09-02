package com.yildirim.mevzuat.model;

import javax.xml.bind.annotation.XmlElement;

public class Bent {
	
	private String bentAdi;
	private String bentIcerik;
	private AltBent altbent;
	

	public Bent() {
		
	}
	
	public Bent(String bentAdi, String bentIcerik, AltBent altbent) {
		this.bentAdi = bentAdi;
		this.bentIcerik = bentIcerik;
		this.altbent = altbent;
	}

	public String getBentAdi() {
		return bentAdi;
	}
	
	@XmlElement
	public void setBentAdi(String bentAdi) {
		this.bentAdi = bentAdi;
	}
	public String getBentIcerik() {
		return bentIcerik;
	}
	
	@XmlElement
	public void setBentIcerik(String bentIcerik) {
		this.bentIcerik = bentIcerik;
	}
	
	public AltBent getAltbent() {
		return altbent;
	}

	@XmlElement
	public void setAltbent(AltBent altbent) {
		this.altbent = altbent;
	}
}
