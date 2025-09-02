package com.yildirim.mevzuat.model;

//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlElement;

@XmlRootElement(name="mevzuat")
public class Mevzuat {
	
	private String mevzuatAdi;
	private String mevzuatIcerik;
	private String tarihi;
	private String resmiGazeteNo;
	private Bent bent;
	
	public Mevzuat() {
		
	}
	
	public Mevzuat(String mevzuatAdi, String mevzuatIcerik, String tarihi, String resmiGazeteNo, Bent bent) {
		
		this.mevzuatAdi = mevzuatAdi;
		this.mevzuatIcerik = mevzuatIcerik;
		this.tarihi = tarihi;
		this.resmiGazeteNo = resmiGazeteNo;
		this.bent = bent;
	}
	public String getMevzuatAdi() {
		return mevzuatAdi;
	}
	
	@XmlElement
	public void setMevzuatAdi(String mevzuatAdi) {
		this.mevzuatAdi = mevzuatAdi;
	}
	public String getMevzuatIcerik() {
		return mevzuatIcerik;
	}
	
	@XmlElement
	public void setMevzuatIcerik(String mevzuatIcerik) {
		this.mevzuatIcerik = mevzuatIcerik;
	}
	public String getTarihi() {
		return tarihi;
	}
	
	@XmlElement
	public void setTarihi(String tarihi) {
		this.tarihi = tarihi;
	}
	public String getResmiGazeteNo() {
		return resmiGazeteNo;
	}
	
	@XmlElement(nillable=true)
	public void setResmiGazeteNo(String resmiGazeteNo) {
		this.resmiGazeteNo = resmiGazeteNo;
	}
	public Bent getBent() {
		return bent;
	}
	
	@XmlElement
	public void setBent(Bent bent) {
		this.bent = bent;
	}
}
