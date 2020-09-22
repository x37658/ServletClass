

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import sun.text.resources.be.FormatData_be_BY;

/**
 * Servlet implementation class HomeWork
 */
@WebServlet(description = "My first servlet homework", urlPatterns = { "/HomeWork" })
public class HomeWork extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CONTENT_TYPE = "text/html; charset=UTF-8";   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeWork() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType(CONTENT_TYPE);
		
		PrintWriter out = response.getWriter();
		String title= "Homework 1 Reading Four Request Parameters";
		
		String param1 = request.getParameter("param1");
		String param2 = request.getParameter("param2");
		String param3 = request.getParameter("param3");
		String[] param4 = request.getParameterValues("hobby");
		int param4Len = request.getContentLength();
		
		
		out.println(
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
					       "Transitional//EN\n" +
			               "<HTML>\n" +
			               "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
				           "<BODY BGCOLOR=\"#FDF5E6\">\n" +
				           "<H1 ALIGN=CENTER>" + title + "</H1>\n" +
				           "<UL>\n" +
				           "  <LI><B>Name</B>: "
				           + param1 + "\n" +
				           "  <LI><B>TEL</B>: "
				           + param2 + "\n" +
				           "  <LI><B>Address</B>: "
				           + param3 + "\n" +
				           "  <LI><B>Hobby</B>: "				          				
				);
		for (String s : param4) {
			out.print(s+"\n");
		}
		out.print("</UL>\n" +
		           "</BODY></HTML>");
		
		
		
		
		
		
//	    response.setContentType(CONTENT_TYPE);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
