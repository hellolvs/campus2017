/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2017-01-02 07:29:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".STYLE2 {font-size: large}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>请输入一段文字:</h2>\r\n");
      out.write("\t<form method=\"post\" action=\"");
      out.print(request.getContextPath());
      out.write("/result\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t<textarea name=\"content\" id=\"content\" cols=\"30\" rows=\"5\">\r\n");
      out.write("\t\t\t\t\t</textarea>\r\n");
      out.write("\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t<table border=\"0\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"统计\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"reset\" value=\"清空内容\"/>\r\n");
      out.write("\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<p><span class=\"STYLE2\">各统计内容的个数如下</span>:</p>\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th width=\"102\">\r\n");
      out.write("\t\t\t\t<p>统计项</p>\r\n");
      out.write("\t\t  </th>\r\n");
      out.write("\t\t\t<th width=\"102\">\r\n");
      out.write("\t\t\t\t<p>个数</p>\r\n");
      out.write("\t\t  </th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>\r\n");
      out.write("\t\t\t\t英文字母\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>\r\n");
      out.write("\t\t\t\t数字\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>\r\n");
      out.write("\t\t\t\t<p>中文汉字</p>\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>\r\n");
      out.write("\t\t\t\t<p>标点符号</p>\r\n");
      out.write("\t\t\t</th>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\t<p class=\"STYLE2\">文字中出现频率最高的三个字是:</p>\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th width=\"102\">\r\n");
      out.write("\t\t\t\t<p>名称</p>\r\n");
      out.write("\t\t  </th>\r\n");
      out.write("\t\t\t<th width=\"102\">\r\n");
      out.write("\t\t\t\t<p>个数</p>\r\n");
      out.write("\t\t  </th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t\t<th>&nbsp;</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
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
}
