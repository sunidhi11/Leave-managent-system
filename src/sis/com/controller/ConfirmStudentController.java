package sis.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sis.com.bo.RegStudent;
import sis.com.dao.RegStudentDao;
import sis.com.daoFactory.DaoFactory;

/**
 * Servlet implementation class ConfirmStudentController
 */
public class ConfirmStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		long enroll = Long.parseLong(request.getParameter("enroll"));
		RegStudentDao dao=DaoFactory.getRegStudentDao();
		
		boolean result= dao.confirmStudent(enroll);
		session.setAttribute("resultConfirmation", result);
			response.sendRedirect("confirmByAdmin.jsp");
		
	}

}
