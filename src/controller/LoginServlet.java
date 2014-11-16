package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String userName= request.getParameter("username");
	String PassWd=request.getParameter("passwd");
	Cookie cookie1=new Cookie("username",userName );
	Cookie cookie2=new Cookie("passwd", PassWd);
	response.addCookie(cookie1);
	response.addCookie(cookie2);
	
	HttpSession session=request.getSession(true);
	session.setAttribute("username", userName);
	
	out.println("<html><body><center><h1>you are logged in as </h1>");
	out.println("<br>User Name: "+userName+"<br>");
	//out.println("<form acion=\"Hello\" method=\"GET\"><input type=\"submit\" value=\"Hello\"></form></center></body></html>");
	out.println("<a href=\"Hello\">Hello</a></body></html>");
	
}
}
