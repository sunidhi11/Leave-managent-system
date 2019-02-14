package sis.com.controller;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import sis.com.bo.RegStudent;
import sis.com.dao.RegStudentDao;
import sis.com.daoFactory.DaoFactory;

import java.util.List;
/**
 * Servlet implementation class RegisterStudent
 */
public class RegisterStudent extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	RegStudent regStudent = new RegStudent();
	
	regStudent.setEnrollmemtNumber(Long.parseLong(request.getParameter("stu_enroll")));//parse
	regStudent.setName(request.getParameter("stu_name"));
	regStudent.setCourse(request.getParameter("course"));
	regStudent.setBranch(request.getParameter("branch"));
	regStudent.setMobileNumber(request.getParameter("stu_mobile"));
	regStudent.setEmail(request.getParameter("stu_email"));
	regStudent.setSemester(Integer.parseInt(""+request.getParameter("sem")));//parse
	regStudent.setAddress(request.getParameter("stu_address"));
			
    regStudent.setFatherName(request.getParameter("father_name"));
    regStudent.setFatherMobile(request.getParameter("father_mobile"));
    regStudent.setFatherEmail(request.getParameter("father_email"));
    regStudent.setFatherAddress(request.getParameter("father_address"));
    
    regStudent.setGuardianName(request.getParameter("guardian_name"));
    regStudent.setGuardianMobile(request.getParameter("guardian_mobile"));
    regStudent.setGuardianEmail(request.getParameter("guardian_email"));
    regStudent.setGuardianAddress(request.getParameter("guardian_address"));
    
    RegStudentDao dao=DaoFactory.getRegStudentDao();
    boolean result=dao.addStudent(regStudent);//function call
    
    HttpSession session = request.getSession();
    session.setAttribute("result",result);
    
    response.sendRedirect("register_student1.jsp");
    
	}
}

