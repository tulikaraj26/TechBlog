package com.tech.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tech.dao.UserDao;
import com.tech.entities.Message;
import com.tech.entities.User;
import com.tech.helper.ConnectionProvider;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//fetch username and password from request
		
		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("password");
	
	    UserDao dao = new UserDao(ConnectionProvider.getConnection());
	    User u = dao.getUserByEmailAndPassword(userEmail,userPassword);
	    
	    if(u==null)
	    {
	    	//login error
//	    	PrintWriter out = response.getWriter();
//	    	out.println("Invalid Details..try again");
	    	
	    	Message msg = new Message("Invalid Details ! try with another","error","alert-danger");
	    	HttpSession s = request.getSession();
	    	s.setAttribute("msg",msg);
	    	response.sendRedirect("login_page.jsp");
	    }
	    else
	    {
	    	//login success
	    	HttpSession s = request.getSession();
	    	s.setAttribute("currentUser",u);
	    	response.sendRedirect("profile.jsp");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
