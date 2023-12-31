package com.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.User;
import com.helperClass.FactoryProvider;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
		
	}

	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ")
				.append(request.getContextPath());
		
		      HttpSession  httpSession;

		try {
			String name = request.getParameter("user_name");
			String email = request.getParameter("user_email");
			String password = request.getParameter("user_password");
			String number = request.getParameter("user_number");
			String address = request.getParameter("user_address");
			
			
           //validation
			if(name.isEmpty() || email.isEmpty() || password.isEmpty() || number.isEmpty() || address.isEmpty()) {
				httpSession =request.getSession();
				httpSession.setAttribute("message", "Register UnSuccessful ! please fill complete Form :" );
				response.sendRedirect("Register.jsp");
				return ;
			}

			// setting values in User class
			User setUserData = new User(name, number, email, password, address,
					"defualt.png", new Date() , "Normal");

			// save data inside DB
			Session hibFactoryObj = FactoryProvider.getFactory().openSession();
			Transaction tx = hibFactoryObj.beginTransaction();

			     hibFactoryObj.persist(setUserData);

               tx.commit();           
			hibFactoryObj.close();
			
//          Getting UserID from DB 
            int userId = setUserData.getId();
			
//			Setting message if sucessfull register 
			 httpSession =request.getSession();
			httpSession.setAttribute("message", "Register Successful ! Your id is : " +userId);
			
			response.sendRedirect("Register.jsp");
			return ;
                      			

		} catch (Exception ex) {
		  httpSession =request.getSession();
			httpSession.setAttribute("message", "Register UnSuccessful ! Something Wrong :" );
			ex.printStackTrace();
               
               
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
