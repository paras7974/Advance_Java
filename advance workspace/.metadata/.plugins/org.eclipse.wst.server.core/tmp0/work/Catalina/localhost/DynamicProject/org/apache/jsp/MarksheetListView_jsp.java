/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2023-08-25 13:19:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.bean.MarksheetBean;
import java.util.List;
import java.util.Iterator;
import in.co.rays.bean.UserBean;

public final class MarksheetListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Header.jsp", Long.valueOf(1692907899756L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.bean.UserBean");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("in.co.rays.bean.MarksheetBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<form action=\"MarksheetListCtl\"method=\"get\">\r\n");
      out.write("\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("       ");

		UserBean bean = (UserBean) session.getAttribute("user");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

		if (bean != null) {
	
      out.write("\r\n");
      out.write("	<h3>\r\n");
      out.write("	    Hi,\r\n");
      out.write("	      ");
      out.print(bean.getFirstName());
      out.write("</h3>\r\n");
      out.write("	      \r\n");
      out.write("	      <a href=\"UserListCtl.do\">UserList</a>\r\n");
      out.write("	      \r\n");
      out.write("	      	<a href=\"MarksheetListCtl\" >MarksheetList</a>\r\n");
      out.write("	      \r\n");
      out.write("	      <a href=\"LoginCtl?operation=logout\">logout</a>\r\n");
      out.write("	      \r\n");
      out.write("	\r\n");
      out.write("	");

		}else{
    
      out.write("\r\n");
      out.write("		<h3>Hi, Guest</h3>\r\n");
      out.write("     ");

		}
	    
	    
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");

			List list = (List) request.getAttribute("list");
		    int pageNo = (int) request.getAttribute("pageNo");

			Iterator it = list.iterator();
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<table border=\"5\">\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("\r\n");
      out.write("				<th>id</th>\r\n");
      out.write("				<th>name</th>\r\n");
      out.write("				<th>rollNo</th>\r\n");
      out.write("				<th>physics</th>\r\n");
      out.write("				<th>chemistry</th>\r\n");
      out.write("				<th>math</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			");

				while (it.hasNext()) {

		     MarksheetBean bean2 = (MarksheetBean)it.next();
			
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>");
      out.print(bean2.getId());
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(bean2.getName());
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(bean2.getRoll_No());
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(bean2.getPhysics());
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(bean2.getChemistry());
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(bean2.getMaths());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("			");

				}
			
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
