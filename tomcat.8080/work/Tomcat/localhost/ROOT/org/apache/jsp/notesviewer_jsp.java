/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/11.0.4
 * Generated at: 2025-03-24 03:06:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import ucl.ac.uk.models.Note;
import java.util.List;

public final class notesviewer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("ucl.ac.uk.models.Note");
    _jspx_imports_classes.add("java.util.List");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${note.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("  <style>\r\n");
      out.write("    body {\r\n");
      out.write("      font-family: Arial, sans-serif;\r\n");
      out.write("      margin: 0;\r\n");
      out.write("      padding: 0;\r\n");
      out.write("      height: 100vh;\r\n");
      out.write("      display: flex;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    p, h1, h2, h3, h4, h5, h6 {\r\n");
      out.write("      margin: 0;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    img {\r\n");
      out.write("      display: block;\r\n");
      out.write("      margin-left: auto;\r\n");
      out.write("      margin-right: auto;\r\n");
      out.write("      max-width: 50%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #noteIndex {\r\n");
      out.write("      width: 200px;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("      overflow-y: auto;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #note {\r\n");
      out.write("      flex: 1;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #content {\r\n");
      out.write("      border: 1px solid #ddd;\r\n");
      out.write("      border-radius: 8px;\r\n");
      out.write("      margin-top: 15px;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("      background-color: #f9f9f9;\r\n");
      out.write("    }\r\n");
      out.write("    .home-link {\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("      margin-bottom: 10px;\r\n");
      out.write("      margin-top: -10px;\r\n");
      out.write("      color: #2196F3;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .home-link:hover {\r\n");
      out.write("      text-decoration: underline;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .nav-link {\r\n");
      out.write("      display: block;\r\n");
      out.write("      padding: 15px;\r\n");
      out.write("      color: #333;\r\n");
      out.write("      text-decoration: none;\r\n");
      out.write("      border-bottom: 1px solid #ddd;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .nav-link:hover {\r\n");
      out.write("      background-color: #ddd;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .edit-button {\r\n");
      out.write("      border: 1px solid #ddd;\r\n");
      out.write("      background-color: #2196F3;\r\n");
      out.write("      color: white;\r\n");
      out.write("      padding: 4px 0px;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("      font-size: 16px;\r\n");
      out.write("      transition: background-color 0.3s;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .edit-button:hover {\r\n");
      out.write("      background-color: #0b7dda;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .delete-button {\r\n");
      out.write("      border: 1px solid #ddd;\r\n");
      out.write("      background-color: #EA6060;\r\n");
      out.write("      color: white;\r\n");
      out.write("      padding: 4px 0px;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("      font-size: 16px;\r\n");
      out.write("      transition: background-color 0.3s;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .delete-button:hover {\r\n");
      out.write("      background-color: #101010;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"noteIndex\">\r\n");
      out.write("  <a href=\"index.html\" class=\"home-link\">Home</a>\r\n");
      out.write("    <h3>Navigation</h3>\r\n");
      out.write("    <br>\r\n");
      out.write("    <div>\r\n");
      out.write("      ");
 List<String> noteList = (List<String>)request.getAttribute("noteList");
      for(String note : noteList) {
      out.write("\r\n");
      out.write("        <a href=\"notes?title=");
      out.print(note);
      out.write("\" class=\"nav-link\">");
      out.print(note);
      out.write("</a>\r\n");
      out.write("      ");
}
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <a href=\"editor\" class=\"nav-link\"><b>+ Create new note</b></a>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"note\">\r\n");
      out.write("    <div style=\"display:flex; width=100%; justify-content: space-between\">\r\n");
      out.write("        <div style=\"flex: 1\"><h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${note.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1></div>\r\n");
      out.write("        <div style=\"display: flex; gap:5px\">\r\n");
      out.write("          <a href=\"editor?editing=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${note.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"edit-button\"><img src=\"img/edit white.png\"></a>\r\n");
      out.write("          <a href=\"delete?file=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${note.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"delete-button\"><img src=\"img/delete white.png\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${note.html}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <br>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
