package com.yildirim.mevzuat.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MevzuatIndirController {
	
	@RequestMapping(value="${pageContext.request.contextPath}/xmlIndir", method=RequestMethod.GET)
	public String XMLIndirCont(Model model) {
		
		return "xmlindir";
	}
	
	@RequestMapping(value="${pageContext.request.contextPath}/dosya", method=RequestMethod.GET)
	@ResponseBody 
	public void XMLIndir(@RequestParam("test") String test, HttpServletResponse resp) throws IOException {
		
		File file = new File("./" + test);
		InputStream is = new FileInputStream(file);
		
		resp.setContentType("application/octet-stream");
		resp.setHeader("Content-Disposition", "attachment; filename=" + file.getName());
		
		 OutputStream os = resp.getOutputStream();
	        byte[] buffer = new byte[1024];
	        int len;
	        while ((len = is.read(buffer)) != -1) {
	            os.write(buffer, 0, len);
	        }
	        os.flush();
	        os.close();
	        is.close();
		
		System.out.println("PARAMETRE" + test);
		
	}

}
