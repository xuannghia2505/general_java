/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author NghiaHX
 * @birthDate 25/05/2000
 * @date 2022-03-14
 * version 1.0
 */
package general.MVC.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import general.MVC.bean.May;
import general.MVC.dao.MayDao;

@Controller
public class lietkedsmayController {
	@RequestMapping(value= {"/lietkedsmay"}, method=RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public ModelAndView dsHS(Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		model.addAttribute("title", "Liệt kê danh sách máy");
	 		
	 		MayDao mayDao = new MayDao();
	 		int soPage = mayDao.getSoPageMay();
	 		int page=1;
	 		String key="";
	 		
	 		//pagination
	 		if(request.getParameter("key")!=null) {
	 			key=request.getParameter("key");
	 			soPage = mayDao.getSoPageMayOfKey(key);
	 			model.addAttribute("key", key);
	 		}

	 		
	 		if(request.getParameter("message")!=null) {
	 			String message = (String) request.getParameter("message");
	 			if(message.equals("pre")) {
	 				if(page!=1) {
	 					page--;
	 				}
	 			}else {
	 				if(page!=soPage) {
	 					page++;
	 				}
	 			}
	 		} 		
	 		else if(request.getParameter("page")!=null) {
	 			 page = Integer.parseInt(request.getParameter("page"));
	 			
	 		}
	 		
	 		ArrayList<May> listMay = mayDao.getMaybyPage(page,key);
	 		model.addAttribute("soPage", soPage);
	 		model.addAttribute("listMay", listMay);
	    	return new ModelAndView("lietkedsmay");
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
}


