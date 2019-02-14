package sis.com.dao;

import java.util.HashMap;
import java.util.List;

import sis.com.bo.RegStudent;


public interface RegStudentDao {
    //new -----------------
	boolean addStudent(RegStudent regstudent);
	List<RegStudent> getAllRegStudents();
	boolean confirmStudent(long enrollment);
	boolean deleteStudent(Long enroll);
  //=============================
	RegStudent getRegStudentById(long enrollment);
	//seema
	
	List<RegStudent> getAllStuBy(String course, String branch, int sem);
	int getSelectedStu(int number, String hostel,List<RegStudent> sortStuList);
	List<RegStudent> getAllByCategory(String course, String branch, int sem,String category);
	HashMap<String, Integer>  getSelectedTabulation(String course, int semester, String[] branches);
    HashMap<String, Integer> getTotalTabulation(String course, int semester,String[] branches);
	List<RegStudent> getAllSelectedStu(String hostel);
	
}
