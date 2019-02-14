package sis.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sis.com.bo.RegStudent;
import sis.com.bo.Student;
import sis.com.dao.RegStudentDao;
import sis.com.dao.StudentDao;
import sis.com.daoFactory.DaoFactory;

/**
 * Servlet implementation class ShowStudentController
 */
public class ShowStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session= request.getSession();
		RegStudentDao dao=DaoFactory.getRegStudentDao();
		List<RegStudent> regstuList= dao.getAllRegStudents();
		if(regstuList!=null){
			session.setAttribute("regstulist",regstuList);
		}
		response.sendRedirect("confirmByAdmin.jsp");
	
	}

}
