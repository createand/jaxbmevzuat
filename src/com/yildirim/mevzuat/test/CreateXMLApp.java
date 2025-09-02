package com.yildirim.mevzuat.test;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.yildirim.mevzuat.model.AltBent;
import com.yildirim.mevzuat.model.Bent;
import com.yildirim.mevzuat.model.Mevzuat;

public class CreateXMLApp {
	
	public static void main(String[] args) {
		CreateXMLApp cxml = new CreateXMLApp();
		cxml.test();
	}

	private void test(){
	AltBent altBent = new AltBent();
	altBent.setAltBentAdi("Alt Bent Deneme");
	altBent.setAltBentIcerik("Deneme Amacý Ýle yapýlan alt bent.");
	Bent bent = new Bent("Deneme Bent", "Deneme Amacý eil yapýlan Alt Bent", altBent);	
	Mevzuat mevzuat = new Mevzuat("Deneme","Deneme Amacý ile yapýlmýþtýr.", "19021983", "883", bent);
	
	String path = Paths.get(".").toAbsolutePath().toString();
	
	System.out.println(path);
	
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	
	try {
		
		File file = new File(path +"/BENTLi_XML_ORNEK_"+dateFormat.format(date)+".xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Mevzuat.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(mevzuat, new FileOutputStream(file));
		jaxbMarshaller.marshal(mevzuat, System.out);
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

