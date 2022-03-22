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

import general.MVC.dao.DichVuDao;
import general.MVC.dao.KhachHangDao;
import general.MVC.dao.SuDungDichVuDao;

@Controller
public class dangkysddvController {
	@RequestMapping(value= {"/dangkysddv"}, method=RequestMethod.GET,produces = "text/plain;charset=UTF-8")
    public ModelAndView dsHS(Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		request.setAttribute("title", "Đăng ký sử dụng dịch vụ");
	    	return new ModelAndView("dangkysddv");
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
	@RequestMapping(value= {"/dangkysddv"}, method=RequestMethod.POST,produces = "text/plain;charset=UTF-8")
    public String insert(RedirectAttributes redirectAttributes,Model model,HttpSession session,HttpServletRequest  request,HttpServletResponse response) {
	 	try {
	 		response.setContentType("text/html;charset=UTF-8");
	 		request.setCharacterEncoding("UTF-8");
	 		String makhachhang = request.getParameter("makh");
	 		String madv = request.getParameter("madv");
	 		Date ngaysd = Date.valueOf(request.getParameter("ngaysd"));
	 		Time giosd = Time.valueOf(request.getParameter("giosd")+":00") ;
	 		int soluong = Integer.parseInt(request.getParameter("soluong")) ;
	 		
	 		System.out.println(makhachhang);
	 		System.out.println(madv);
	 		System.out.println(ngaysd);
	 		System.out.println(giosd);
	 		System.out.println(soluong);
	 		
	 		DichVuDao dvDao=new DichVuDao();
	 		KhachHangDao khDao= new KhachHangDao();
	 		SuDungDichVuDao sddvDao= new SuDungDichVuDao();
	 		
	 		
	 		if(dvDao.getDichVuById(madv)==null) {
	 			redirectAttributes.addFlashAttribute("message", "Ma dich vu is not exist");
	 		}
	 		else if(khDao.getKHById(makhachhang)==null){
	 			redirectAttributes.addFlashAttribute("message", "Ma khach hang is not exist");
	 		}
	 		else if (sddvDao.DangKySuDungDichVu(madv, makhachhang, ngaysd, giosd, soluong)==-1){
	 			redirectAttributes.addFlashAttribute("message", "Failed Insert");
	 		}else {
	 			redirectAttributes.addFlashAttribute("message", "Successfully Insert");
	 		}
	    	return "redirect:/dangkysddv";
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
       
    }
}


