/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author NghiaHX
 * @birthDate 25/05/2000
 * @date 2022-03-14
 * version 1.0
 */
package general.MVC.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import general.MVC.dao.MayDao;



@Controller
public class taomoimayController {
	@RequestMapping(value= {"/","/taomoimay"}, method=RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public ModelAndView formNewMay(Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		model.addAttribute("title", "Tạo mới máy");
	    	return new ModelAndView("taomoimay");
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
	@RequestMapping(value= {"/","/taomoimay"}, method=RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String insert(RedirectAttributes redirectAttributes,Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		String mamay = request.getParameter("mamay");
	 		String vitri = request.getParameter("vitri");
	 		String trangthai = request.getParameter("trangthai");
	 		
	 		MayDao mayDao = new MayDao();
	 		int flag= mayDao.insertMay(mamay, vitri, trangthai);
	 		
	 		if(flag ==-1) {
	 			redirectAttributes.addFlashAttribute("message", "Failed Insert");
	 		}else {
	 			redirectAttributes.addFlashAttribute("message", "Successfully Insert");
	 		}
	 		
	    	return "redirect:/taomoimay";
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
       
}


