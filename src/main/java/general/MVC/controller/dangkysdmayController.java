/*
 * (C) Copyright 2022 Fresher Academy. All Rights Reserved
 *
 * @author NghiaHX
 * @birthDate 25/05/2000
 * @date 2022-03-14
 * version 1.0
 */
package general.MVC.controller;

import java.sql.Time;
import java.sql.Date;

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
import general.MVC.dao.MayDao;
import general.MVC.dao.SuDungMayDao;

@Controller
public class dangkysdmayController {
	@RequestMapping(value= {"/dangkysdmay"}, method=RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public ModelAndView dsHS(Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		request.setAttribute("title", "Đăng ký sử dụng máy");
	    	return new ModelAndView("dangkysdmay");
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
	@RequestMapping(value= {"/dangkysdmay"}, method=RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String insert(RedirectAttributes redirectAttributes,Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		String makhachhang = request.getParameter("makh");
	 		String mamay = request.getParameter("mamay");
	 		Date ngaybdsd = Date.valueOf(request.getParameter("ngaysd"));
	 		Time giobdsd = Time.valueOf(request.getParameter("giosd")+":00") ;
	 		int thoigiansd = Integer.parseInt(request.getParameter("thoigiansd")) ;
	 		
	 		MayDao mayDao = new MayDao();
	 		KhachHangDao khDao= new KhachHangDao();
	 		SuDungMayDao sdmayDao= new SuDungMayDao();
	 		
	 		if(mayDao.getMayById(mamay)==null) {
	 			System.out.println("hi");
	 			redirectAttributes.addFlashAttribute("message", "Ma may is not exist");
	 		}
	 		else if(khDao.getKHById(makhachhang)==null){
	 			redirectAttributes.addFlashAttribute("message", "Ma khach hang is not exist");
	 		}
	 		else if (sdmayDao.DangKySuDungMay(mamay, makhachhang, ngaybdsd, giobdsd, thoigiansd)==-1){
	 			redirectAttributes.addFlashAttribute("message", "Failed Insert");
	 		}else {
	 			redirectAttributes.addFlashAttribute("message", "Successfully Insert");
	 		}
	    	return "redirect:/dangkysdmay";
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
}


