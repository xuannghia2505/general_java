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

import general.MVC.dao.DichVuDao;
import general.MVC.dao.KhachHangDao;

@Controller
public class taomoidvController {
	@RequestMapping(value= {"/taomoidv"}, method=RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public ModelAndView dsHS(Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		request.setAttribute("title", "Tạo mới dịch vụ");
	    	return new ModelAndView("taomoidv");
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
	@RequestMapping(value= {"/taomoidv"}, method=RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String insertKH(RedirectAttributes redirectAttributes,Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		String madv = request.getParameter("madv");
	 		String tendv = request.getParameter("tendv");
	 		String donvitinh = request.getParameter("donvitinh");
	 		Long dongia = Long.parseLong(request.getParameter("dongia"));
	 		DichVuDao dvDao = new DichVuDao();
	 		int flag= dvDao.insertDichVu(madv, tendv, donvitinh, dongia);
	 		if(flag ==-1) {
	 			redirectAttributes.addFlashAttribute("message", "Failed Insert");
	 		}else {
	 			redirectAttributes.addFlashAttribute("message", "Successfully Insert");
	 		}
	    	return "redirect:/taomoidv";
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
}


