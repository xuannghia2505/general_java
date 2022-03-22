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

import general.MVC.bean.KhachHang;
import general.MVC.dao.KhachHangDao;


@Controller
public class lietkedskhController {
	@RequestMapping(value= {"/lietkedskh"}, method=RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public ModelAndView dsHS(Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		KhachHangDao khDao = new KhachHangDao();
	 		int soPage = khDao.getSoPageKH();
	 		int page=1;
	 		String key="";
	 		
	 		//pagination
	 		if(request.getParameter("key")!=null) {
	 			key=request.getParameter("key");
	 			soPage = khDao.getSoPageKHOfKey(key);
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
	 		
	 		ArrayList<KhachHang> listKH = khDao.getKHbyPage(page,key);
	 		model.addAttribute("soPage", soPage);
	 		model.addAttribute("listKH", listKH);
	    	return new ModelAndView("lietkedskh");
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
}


