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

import general.MVC.dao.KhachHangDao;

@Controller
public class taomoikhController {
	@RequestMapping(value= {"/taomoikh"}, method=RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public ModelAndView dsNewKH(Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		request.setAttribute("title", "Tạo mới khách hàng");
	    	return new ModelAndView("taomoikh");
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
	@RequestMapping(value= {"/taomoikh"}, method=RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String insertKH(RedirectAttributes redirectAttributes,Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		String makh = request.getParameter("makh");
	 		String tenkh = request.getParameter("tenkh");
	 		String diachi = request.getParameter("diachi");
	 		String sdt = request.getParameter("sdt");
	 		String email = request.getParameter("email");
	 		KhachHangDao khDao = new KhachHangDao();
	 		int flag= khDao.insertKhachHang(makh, tenkh, diachi, sdt, email);
	 		if(flag ==-1) {
	 			redirectAttributes.addFlashAttribute("message", "Failed Insert");
	 		}else {
	 			redirectAttributes.addFlashAttribute("message", "Successfully Insert");
	 		}
	    	return "redirect:/taomoikh";
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
}


