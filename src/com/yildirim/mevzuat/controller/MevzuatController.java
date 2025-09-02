package com.yildirim.mevzuat.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MevzuatController {

	
	@RequestMapping(value="${pageContext.request.contextPath}/dashboard",method=RequestMethod.GET)
	public @ResponseBody String dahboardPage(Model model, HttpServletResponse resp) throws IOException{
		
		//resp.setContentType(APPLICATION_XML);
		
		String path = Paths.get(".").toAbsolutePath().toString();
		
		System.out.println(path);
		
		
		File dir = new File(path);
		File[] files = dir.listFiles();
		
		ArrayList<File> filPaths = new ArrayList<File>();
		
		for (File file : files) {
			InputStream in = new FileInputStream(file);
			filPaths.add(file);
			resp.setHeader("Content-Disposition", "attachment; filename=" + file.getName());
			FileCopyUtils.copy(in, resp.getOutputStream());
		}
		
		
		model.addAttribute("files", filPaths);
		
		return "dashboard";
	
	}
}
