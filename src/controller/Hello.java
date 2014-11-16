package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Hello extends HttpServlet {
	

	public void init() throws ServletException{
		
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
	ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body><h1>Welcome  "+request.getCookies()[0].getValue().toString()+" !!!</h1>"
				+ "user name obtained from session:"+request.getSession(true).getAttribute("username")+"<body></html>");
	}
	public void destroy(){
		
	}

	}


