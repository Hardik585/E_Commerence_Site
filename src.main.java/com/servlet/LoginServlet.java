package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.entity.User;
import com.helperClass.FactoryProvider;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UserDao userDao;
		User user;
		HttpSession session;

		try {
			String email = request.getParameter("user_email");
			String password = request.getParameter("user_password");

			// Validation
			if (email.isEmpty() || password.isEmpty()) {
				session = request.getSession();
				session.setAttribute("message", "Please enter full Details ");
			}

			// passing the value to db for checking
			userDao = new UserDao(FactoryProvider.getFactory());
			user = userDao.getDetailByEmailAndPassword(email, password);

			session = request.getSession();
			session.setAttribute("Current-User-Type", user);

			if (user != null) {

				if (user.getUser_type().equals("admin")) {

					response.sendRedirect("AdminUser.jsp");
					return;
				} else if (user.getUser_type().equals("Normal")) {

					response.sendRedirect("NormalUser.jsp");
					return;
				} else {
					response.getWriter()
							.println("We are not able to identify You "
									+ user.getUser_type());
				}

			} else {
				session = request.getSession();
				session.setAttribute("message", "You enter wrong details ");
				response.sendRedirect("Login.jsp");
				return;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
