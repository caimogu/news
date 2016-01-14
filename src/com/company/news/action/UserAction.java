package com.company.news.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.company.news.bean.User;
import com.company.news.service.impl.UserService;

public class UserAction extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private UserService userService;
	
	public UserAction() throws SQLException {
		userService=new UserService();
	}

	public void destroy() {
	 // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doPost(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			String a = request.getParameter("a");
			if(a==null){
				try {
					list(request,response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return;
			}else if(a.equals("checklogin")){
				try {
					checklogin(request,response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(a.equals("save")){
				
			}else if(a.equals("exit")){
				HttpSession session = request.getSession();
				session.removeAttribute("user");
				response.sendRedirect("login.jsp");
				
			}
	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute("userlist", userService.getUser(request.getParameter("username"), request.getParameter("password")));
		request.getRequestDispatcher("jsp/user/list.jsp").forward(request, response);
	}

	private void checklogin(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password =request.getParameter("password");
		User user=userService.getUser(username, password);
		if(user!=null){
			
			//request.setAttribute("user", user);
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("admin/index.jsp");
		}
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
