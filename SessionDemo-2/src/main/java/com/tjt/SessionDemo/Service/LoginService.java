package com.tjt.SessionDemo.Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service

public class LoginService extends HttpServlet {
	//create a profile

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		HttpSession session=request.getSession(false);
		if(session!=null){
			String name=(String)session.getAttribute("name");
			out.print("hello," +name +"welcome");
		}
			else{
				out.print("login first");
				request.getRequestDispatcher("login.html").include(request, response);
				out.close();
			}
		}
	//login
	public void doLogin(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
//	request.getRequestDispatcher("link.html");
	String name=request.getParameter("name");
	String password=request.getParameter(" ");
	if(password.equals("admin123")){
		out.println("welcome" + name);
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
	}
	else
	{
		System.out.println("sorry username or password not match");
		request.getRequestDispatcher("login.html").include(request, response);
	}
	out.close();

}
	//logout
	protected void logoutGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		HttpSession session=request.getSession();
		session.invalidate();
		out.print("you are successfully logged out");
		out.close();
	}

	}



