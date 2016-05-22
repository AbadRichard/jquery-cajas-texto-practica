package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/jquery-entropizer.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\"> <div class=\"col-lg-4\"></div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <h1>Registro</h1>\n");
      out.write("                  </div>\n");
      out.write("                <div class=\"col-lg-4\"></div></div></div><br>\n");
      out.write("                ");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-4\"></div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <form class=\"form-horizontal\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-md-3\">Nombre</label>\n");
      out.write("                                <div class=\"col-lg-9\">\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" value=\"\" placeholder=\"Nombre\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-md-3\">Correo</label>\n");
      out.write("                                <div class=\"col-lg-9\">\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" value=\"\" placeholder=\"Correo\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-md-3\">Contraseña</label>\n");
      out.write("                                <div class=\"col-lg-9\">\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" value=\"\" placeholder=\"Contraseña\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-md-3\">Repit Contraseña</label>\n");
      out.write("                                <div class=\"col-lg-9\">\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" name=\"\" value=\"\" placeholder=\"Contraseña(Repite)\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("           <div id=\"top\" class=\"container\">\n");
      out.write("        <div class=\"page-header\">\n");
      out.write("            <h1>Entropizer Demos</h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-9\">\n");
      out.write("            <div class=\"alert alert-info\">\n");
      out.write("                Project page: <a href=\"https://github.com/jreesuk/jquery-entropizer\">https://github.com/jreesuk/jquery-entropizer</a>\n");
      out.write("            </div>\n");
      out.write("            <hr />\n");
      out.write("            <div id=\"default\" class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    Default UI\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form class=\"form-horizontal\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password1\" class=\"col-md-2 control-label\">Password:</label>\n");
      out.write("                            <div class=\"col-md-5\">\n");
      out.write("                                <input type=\"password\" id=\"password1\" class=\"form-control\" placeholder=\"Enter a password\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-5\" id=\"meter1\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <hr />\n");
      out.write("                    <h4>JS</h4>\n");
      out.write("   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"thin\" class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    Thin bar, no text\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form class=\"form-horizontal\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password2\" class=\"col-md-2 control-label\">Password:</label>\n");
      out.write("                            <div class=\"col-md-10\">\n");
      out.write("                                <input type=\"password\" id=\"password2\" class=\"form-control\" placeholder=\"Enter a password\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div id=\"meter2\" class=\"col-md-10 col-md-offset-2\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <hr />\n");
      out.write("                    <h4>JS</h4>\n");
      out.write("    \n");
      out.write("                    <hr />\n");
      out.write("                    <h4>CSS</h4>\n");
      out.write(" \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"bootstrap\" class=\"panel panel-primary\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    Bootstrap progress bar\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form class=\"form-horizontal\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password3\" class=\"col-md-2 control-label\">Password:</label>\n");
      out.write("                            <div class=\"col-md-5\">\n");
      out.write("                                <input type=\"password\" id=\"password3\" class=\"form-control\" placeholder=\"Enter a password\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"meter3\" class=\"col-md-5\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <hr />\n");
      out.write("                    <h4>JS</h4>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-3 hidden-sm hidden-xs\">\n");
      out.write("            <div id=\"sidebar\" data-spy=\"affix\" data-offset-top=\"100\">\n");
      out.write("                <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                    <li class=\"active\"><a href=\"#default\">Default</a></li>\n");
      out.write("                    <li><a href=\"#thin\">Thin, no text</a></li>\n");
      out.write("                    <li><a href=\"#bootstrap\">Bootstrap</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <hr />\n");
      out.write("                <a href=\"#top\">Back to top</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/entropizer.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/jquery-entropizer.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        (function($) {\n");
      out.write("            $('#meter1').entropizer({ target: '#password1' });\n");
      out.write("            $('#meter2').entropizer({\n");
      out.write("                target: '#password2',\n");
      out.write("                update: function(data, ui) {\n");
      out.write("                    ui.bar.css({\n");
      out.write("                        'background-color': data.color,\n");
      out.write("                        'width': data.percent + '%'\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            var max = 80;\n");
      out.write("            $('#meter3').entropizer({\n");
      out.write("                target: '#password3',\n");
      out.write("                maximum: max,\n");
      out.write("                buckets: [\n");
      out.write("                    { max: 20, suffix: 'danger' },\n");
      out.write("                    { min: 20, max: 40, suffix: 'warning' },\n");
      out.write("                    { min: 40, max: 60, suffix: 'success' },\n");
      out.write("                    { min: 60, suffix: 'info' }\n");
      out.write("                ],\n");
      out.write("                create: function(container) {\n");
      out.write("                    var wrapper = $('<div>').addClass('progress progress-striped active').appendTo(container);\n");
      out.write("                    var bar = $('<div>').addClass('progress-bar')\n");
      out.write("                        .attr({\n");
      out.write("                            'role': 'progressbar',\n");
      out.write("                            'aria-valuemin': 0,\n");
      out.write("                            'aria-valuemax': max\n");
      out.write("                        })\n");
      out.write("                        .appendTo(wrapper);\n");
      out.write("                    return {\n");
      out.write("                        wrapper: wrapper,\n");
      out.write("                        bar: bar\n");
      out.write("                    };\n");
      out.write("                },\n");
      out.write("                update: function(data, ui) {\n");
      out.write("                    ui.bar.css({\n");
      out.write("                        'width': data.percent + '%'\n");
      out.write("                    })\n");
      out.write("                        .attr({\n");
      out.write("                            'aria-valuenow': data.entropy\n");
      out.write("                        })\n");
      out.write("                        .text(data.entropy.toFixed(0));\n");
      out.write("                    ui.bar[0].className = 'progress-bar progress-bar-' + data.suffix;\n");
      out.write("                },\n");
      out.write("                destroy: function(ui) {\n");
      out.write("                    ui.wrapper.remove();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        })($);\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/jquery-entropizer.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/jquery-entropizer.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
