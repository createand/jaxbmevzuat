package com.yildirim.mevzuat.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.Marshaller;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import com.yildirim.mevzuat.model.AltBent;
import com.yildirim.mevzuat.model.Bent;
import com.yildirim.mevzuat.model.Mevzuat;


@WebServlet(name = "${pageContext.request.contextPath}/testXML")
public class CreateMevzuatServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		Mevzuat mevzuat = new Mevzuat();
		Bent bent = new Bent();
		AltBent altbent = new AltBent();
		
		mevzuat.setMevzuatAdi(req.getParameter("mevzuatAdi"));
		mevzuat.setMevzuatIcerik(req.getParameter("mevzuatIcerik"));
		mevzuat.setTarihi(req.getParameter("tarihi"));
		mevzuat.setResmiGazeteNo(req.getParameter("resmiGazeteNo"));
		
		bent.setBentAdi(req.getParameter("bentAdi"));
		bent.setBentIcerik(req.getParameter("bentIcerik"));
		
		altbent.setAltBentIcerik(req.getParameter("altBentIcerik"));
		altbent.setAltBentAdi(req.getParameter("altBentAdi"));
		
		mevzuat.setBent(bent);
		mevzuat.getBent().setAltbent(altbent);

		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		String path = Paths.get(".").toAbsolutePath().toString();

		System.out.println(path);

		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

		try {

			File file = new File(path + "/OlusanXML_" + dateFormat.format(date) + ".xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Mevzuat.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(mevzuat, new FileOutputStream(file));
			jaxbMarshaller.marshal(mevzuat, System.out);

			out.println("Dosya Adi: " + "OlusanXML_" + dateFormat.format(date) + ".xml");
			out.println("<br />");
			out.println("<p>Dosya Adini kopyalayip indirme sayfasindan indiriniz</p>");
			out.println("<a href='${pageContext.request.contextPath}/xmlIndir'>Indirme Sayfasi</a>");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
