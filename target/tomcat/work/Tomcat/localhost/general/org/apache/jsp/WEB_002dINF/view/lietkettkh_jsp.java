/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-03-18 03:10:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lietkettkh_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/view/taglib.jsp", Long.valueOf(1647424138347L));
    _jspx_dependants.put("/WEB-INF/view/navbar.jsp", Long.valueOf(1647269793392L));
    _jspx_dependants.put("/WEB-INF/view/footer.jsp", Long.valueOf(1647424297713L));
    _jspx_dependants.put("/WEB-INF/view/header.jsp", Long.valueOf(1647433411965L));
    _jspx_dependants.put("/css/style.css", Long.valueOf(1647433795318L));
    _jspx_dependants.put("/javascript/main.js", Long.valueOf(1647438041008L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\">\r\n");
      out.write("<script >");
      out.write("function validateForm(){\r\n");
      out.write("\tvar flag = true;\r\n");
      out.write("\tvar mamay = document.getElementById(\"mamay\");\r\n");
      out.write("\tvar vitri = document.getElementById(\"vitri\");\r\n");
      out.write("\tvar trangthai = document.getElementById(\"trangthai\");\r\n");
      out.write("\tvar makh = document.getElementById(\"makh\");\r\n");
      out.write("\tvar tenkh = document.getElementById(\"tenkh\");\r\n");
      out.write("\tvar diachi = document.getElementById(\"diachi\");\r\n");
      out.write("\tvar sdt = document.getElementById(\"sdt\");\r\n");
      out.write("\tvar email = document.getElementById(\"email\");\r\n");
      out.write("\tvar madv = document.getElementById(\"madv\");\r\n");
      out.write("\tvar tendv = document.getElementById(\"tendv\");\r\n");
      out.write("\tvar donvitinh = document.getElementById(\"donvitinh\");\r\n");
      out.write("\tvar dongia = document.getElementById(\"dongia\");\r\n");
      out.write("\tvar ngaysd = document.getElementById(\"ngaysd\");\r\n");
      out.write("\tvar giosd = document.getElementById(\"giosd\");\r\n");
      out.write("\tvar soluong = document.getElementById(\"soluong\");\r\n");
      out.write("\tvar thoigiansd = document.getElementById(\"thoigiansd\");\r\n");
      out.write("\t\r\n");
      out.write("\tconst phoneValid= /([(84)+90|(84)+91|090|091])+([0-9]{7})\\b/;\r\n");
      out.write("\tconst emailValid = /^(([^<>()[\\]\\\\.,;:\\s@\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/;\r\n");
      out.write("\tconst numberValid = /^[0-9]+$/;\r\n");
      out.write("\tconst makhValid = /^KH+[0-9]{5}$/;\r\n");
      out.write("\tconst madvValid = /^DV+[0-9]{3}$/;\r\n");
      out.write("\t\r\n");
      out.write("\t//may\r\n");
      out.write("\tif(mamay!=null&&mamay.value==\"\"){\r\n");
      out.write("\t    document.getElementById(\"mamay1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(mamay!=null){\r\n");
      out.write("\t    document.getElementById(\"mamay1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(vitri!=null&&vitri.value==\"\"){\r\n");
      out.write("\t    document.getElementById(\"vitri1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(vitri!=null){\r\n");
      out.write("\t    document.getElementById(\"vitri1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(trangthai!=null&&trangthai.value==\"\"){\r\n");
      out.write("\t    document.getElementById(\"trangthai1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(trangthai!=null){\r\n");
      out.write("\t    document.getElementById(\"trangthai1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\t//kh\r\n");
      out.write("\tif(makh!=null&&(!makhValid.test(makh.value)||makh.value==\"\")){\r\n");
      out.write("\t    document.getElementById(\"makh1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(makh!=null){\r\n");
      out.write("\t    document.getElementById(\"makh1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(tenkh!=null&&tenkh.value==\"\"){\r\n");
      out.write("\t    document.getElementById(\"tenkh1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(tenkh!=null){\r\n");
      out.write("\t    document.getElementById(\"tenkh1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(diachi!=null&&diachi.value==\"\"){\r\n");
      out.write("\t    document.getElementById(\"diachi1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(diachi!=null){\r\n");
      out.write("\t    document.getElementById(\"diachi1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(sdt!=null&&(sdt.value==\"\"||!phoneValid.test(sdt.value))){\r\n");
      out.write("\t    document.getElementById(\"sdt1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(sdt!=null){\r\n");
      out.write("\t    document.getElementById(\"sdt1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(email!=null&&(email.value==\"\"||!emailValid.test(email.value))){\r\n");
      out.write("\t    document.getElementById(\"email1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(email!=null){\r\n");
      out.write("\t    document.getElementById(\"email1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\t//dv\r\n");
      out.write("\tif(madv!=null&&(!madvValid.test(madv.value)||madv.value==\"\")){\r\n");
      out.write("\t    document.getElementById(\"madv1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(madv!=null){\r\n");
      out.write("\t    document.getElementById(\"madv1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(tendv!=null&&tendv.value==\"\"){\r\n");
      out.write("\t    document.getElementById(\"tendv1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(tendv!=null){\r\n");
      out.write("\t    document.getElementById(\"tendv1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(donvitinh!=null&&donvitinh.value==\"\"){\r\n");
      out.write("\t    document.getElementById(\"donvitinh1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(donvitinh!=null){\r\n");
      out.write("\t    document.getElementById(\"donvitinh1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(dongia!=null&&(dongia.value==\"\"||!numberValid.test(dongia.value))){\r\n");
      out.write("\t    document.getElementById(\"dongia1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(dongia!=null){\r\n");
      out.write("\t    document.getElementById(\"dongia1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\t//sd\r\n");
      out.write("\tif(ngaysd!=null&&ngaysd.value==\"\"){\r\n");
      out.write("\t    document.getElementById(\"ngaysd1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(ngaysd!=null){\r\n");
      out.write("\t    document.getElementById(\"ngaysd1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(giosd!=null&&giosd.value==\"\"){\r\n");
      out.write("\t    document.getElementById(\"giosd1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(giosd!=null){\r\n");
      out.write("\t    document.getElementById(\"giosd1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(thoigiansd!=null&&(thoigiansd.value==\"\"||!numberValid.test(thoigiansd.value))){\r\n");
      out.write("\t    document.getElementById(\"thoigiansd1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(thoigiansd!=null){\r\n");
      out.write("\t    document.getElementById(\"thoigiansd1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\tif(soluong!=null&&(soluong.value==\"\"||!numberValid.test(soluong.value))){\r\n");
      out.write("\t    document.getElementById(\"soluong1\").innerText=\"Loi\";\r\n");
      out.write("\t    flag= false;\r\n");
      out.write("\t}else if(soluong!=null){\r\n");
      out.write("\t    document.getElementById(\"soluong1\").innerText=\"\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\treturn flag;\r\n");
      out.write("}");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<title>");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>");
      out.write(".ul-custom li a{\r\n");
      out.write("\tcolor:green !important;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".ul-custom li:hover{\r\n");
      out.write("\tbackground-color: #c0c0c0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-custom{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\t\r\n");
      out.write("\tleft:120px;\r\n");
      out.write("}\r\n");
      out.write(".search-custom{\r\n");
      out.write("\twidth:200px;\r\n");
      out.write("}\r\n");
      out.write("small {\r\n");
      out.write("\tcolor:red;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("<body class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("      <ul class=\"navbar-nav mr-auto ul-custom\">\r\n");
      out.write("        <li class=\"nav-item active\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"taomoimay\">Tạo mới máy</a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"taomoikh\">Tạo mới khách hàng</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"taomoidv\">Tạo mới dịch vụ</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"lietkedsmay\">Liệt kê danh sách máy</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"lietkedskh\">Liệt kê danh sách khách hàng</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"lietkedsdv\">Liệt Kê danh sách dịch vụ</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"dangkysdmay\">Đăng ký sử dụng máy</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"dangkysddv\">Đăng ký sử dụng dịch vụ</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"lietkettkh\">Liệt kê toàn bộ thông tin khách hàng</a>\r\n");
      out.write("          </li>\r\n");
      out.write("       \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>");
      out.write("\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">Mã khách hàng</th>\r\n");
      out.write("      <th scope=\"col\">Tên khách hàng</th>\r\n");
      out.write("      <th scope=\"col\">Mã máy</th>\r\n");
      out.write("      <th scope=\"col\">Vị trí</th>\r\n");
      out.write("      <th scope=\"col\">Trạng thái</th>\r\n");
      out.write("      <th scope=\"col\">Ngày bắt đầu sử dụng máy</th>\r\n");
      out.write("      <th scope=\"col\">Giờ bắt đầu sử dụng máy</th>\r\n");
      out.write("      <th scope=\"col\">Thời gian sử dụng máy</th>\r\n");
      out.write("      <th scope=\"col\">Mã dịch vụ</th>\r\n");
      out.write("      <th scope=\"col\">Ngày sử dụng dịch vụ</th>\r\n");
      out.write("      <th scope=\"col\">Giờ sử dụng dịch vụ</th>\r\n");
      out.write("      <th scope=\"col\">Số lượng</th>\r\n");
      out.write("      <th scope=\"col\">Tổng tiền</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">1</th>\r\n");
      out.write("      <td>Mark</td>\r\n");
      out.write("      <td>Otto</td>\r\n");
      out.write("      <td>@mdo</td>\r\n");
      out.write("      <td>Mark</td>\r\n");
      out.write("      <td>Otto</td>\r\n");
      out.write("      <td>@mdo</td>\r\n");
      out.write("      <td>Mark</td>\r\n");
      out.write("      <td>Otto</td>\r\n");
      out.write("      <td>@mdo</td>\r\n");
      out.write("      <td>Mark</td>\r\n");
      out.write("      <td>Otto</td>\r\n");
      out.write("      <td>@mdo</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\t\r\n");
      out.write("<div class=\"mx-auto\" style=\"width: 250px;\">\r\n");
      out.write("\t<ul class=\"pagination\" style=\"width: 100%;\">\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">Previous</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("\t\t<li class=\"page-item\"><a class=\"page-link\" href=\"#\">Next</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("<footer class=\"page-footer font-small mdb-color lighten-3 pt-4 footer-custom\">\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer Elements -->\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <!--Grid row-->\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-2 col-md-12 mb-4\">\r\n");
      out.write("\r\n");
      out.write("        <!--Image-->\r\n");
      out.write("        <div class=\"view overlay z-depth-1-half\">\r\n");
      out.write("          <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(73).webp\" class=\"img-fluid\"\r\n");
      out.write("            alt=\"\">\r\n");
      out.write("          <a href=\"\">\r\n");
      out.write("            <div class=\"mask rgba-white-light\"></div>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-2 col-md-6 mb-4\">\r\n");
      out.write("\r\n");
      out.write("        <!--Image-->\r\n");
      out.write("        <div class=\"view overlay z-depth-1-half\">\r\n");
      out.write("          <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(78).webp\" class=\"img-fluid\"\r\n");
      out.write("            alt=\"\">\r\n");
      out.write("          <a href=\"\">\r\n");
      out.write("            <div class=\"mask rgba-white-light\"></div>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-2 col-md-6 mb-4\">\r\n");
      out.write("\r\n");
      out.write("        <!--Image-->\r\n");
      out.write("        <div class=\"view overlay z-depth-1-half\">\r\n");
      out.write("          <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(79).webp\" class=\"img-fluid\"\r\n");
      out.write("            alt=\"\">\r\n");
      out.write("          <a href=\"\">\r\n");
      out.write("            <div class=\"mask rgba-white-light\"></div>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-2 col-md-12 mb-4\">\r\n");
      out.write("\r\n");
      out.write("        <!--Image-->\r\n");
      out.write("        <div class=\"view overlay z-depth-1-half\">\r\n");
      out.write("          <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(81).webp\" class=\"img-fluid\"\r\n");
      out.write("            alt=\"\">\r\n");
      out.write("          <a href=\"\">\r\n");
      out.write("            <div class=\"mask rgba-white-light\"></div>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-2 col-md-6 mb-4\">\r\n");
      out.write("\r\n");
      out.write("        <!--Image-->\r\n");
      out.write("        <div class=\"view overlay z-depth-1-half\">\r\n");
      out.write("          <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(82).webp\" class=\"img-fluid\"\r\n");
      out.write("            alt=\"\">\r\n");
      out.write("          <a href=\"\">\r\n");
      out.write("            <div class=\"mask rgba-white-light\"></div>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("      <div class=\"col-lg-2 col-md-6 mb-4\">\r\n");
      out.write("\r\n");
      out.write("        <!--Image-->\r\n");
      out.write("        <div class=\"view overlay z-depth-1-half\">\r\n");
      out.write("          <img src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(84).webp\" class=\"img-fluid\"\r\n");
      out.write("            alt=\"\">\r\n");
      out.write("          <a href=\"\">\r\n");
      out.write("            <div class=\"mask rgba-white-light\"></div>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!--Grid column-->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--Grid row-->\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Footer Elements -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("  <div class=\"footer-copyright text-center py-3\">© 2020 Copyright:\r\n");
      out.write("    <a href=\"https://www.fpt-software.com/\" target=\"_blank\"> FPT SoftWare</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/view/header.jsp(12,7) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
