package sis.com.dao.impl;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import sis.com.bo.RegStudent;
import sis.com.bo.Student;
import sis.com.dao.RegStudentDao;
import sis.com.util.SisDbUtil;

public class RegisterStudentImpl implements RegStudentDao {

public boolean  addStudent(RegStudent regstudent){
		
		 Connection con=null;
		 PreparedStatement pstmt=null;
		 PreparedStatement pstmt_getid=null;
		 PreparedStatement pstmt_parent=null;
		 PreparedStatement pstmt_guardian=null;
		 PreparedStatement pstmt_doc=null;
		 int result=0;
		 ResultSet rs= null;
		try{
			con  = SisDbUtil.getConnection();
		
		
String sql="insert into student(enroll,name,course,branch,semester,email,mobileno,address)"
		+ "values(?,?,?,?,?,?,?,?)";
 pstmt=con.prepareStatement(sql);
 //===============student details==========================
 pstmt.setLong(1,regstudent.getEnrollmemtNumber());
 pstmt.setString(2,regstudent.getName());
 pstmt.setString(3, regstudent.getCourse());
 pstmt.setString(4,regstudent.getBranch());
 pstmt.setInt(5, regstudent.getSemester());
 pstmt.setString(6, regstudent.getEmail());
 pstmt.setString(7, regstudent.getMobileNumber());
 pstmt.setString(8,regstudent.getAddress());
 
int result1=pstmt.executeUpdate();
System.out.println(" student table inserted"+result);
 
 
 //parent details================================

  String sql_parent= "insert into father_detail(enroll,name,mobile,"
  		+ "email,address)"
  		+ "values(?,?,?,?,?)";
     pstmt_parent= con.prepareStatement(sql_parent);
     System.out.println("parent start");
 pstmt_parent.setLong(1,regstudent.getEnrollmemtNumber());
 pstmt_parent.setString(2,regstudent.getFatherName());
 pstmt_parent.setString(3,regstudent.getFatherMobile());
 pstmt_parent.setString(4,regstudent.getFatherEmail());
 pstmt_parent.setString(5,regstudent.getFatherAddress());

 int result2=pstmt_parent.executeUpdate();
 System.out.println("parent end");
 System.out.println("parent table inserted"+result1);
 
 //===guardian doc================================
 String sqlGuardian= "insert into guardian_detail(enroll,name,mobile,email,address)"
	  		+ "values(?,?,?,?,?)";
	     pstmt_guardian= con.prepareStatement(sqlGuardian);
	     System.out.println("guardian start");
	     pstmt_guardian.setLong(1,regstudent.getEnrollmemtNumber());
	     pstmt_guardian.setString(2,regstudent.getGuardianName());
	     pstmt_guardian.setString(3,regstudent.getGuardianMobile());
	     pstmt_guardian.setString(4,regstudent.getGuardianEmail());
	     pstmt_guardian.setString(5,regstudent.getGuardianAddress());

	 int result3=pstmt_parent.executeUpdate();
	 System.out.println("Guardian end");
	 System.out.println("Guardian table inserted"+result1);
 
 
 }catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				if(con!=null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(result==3){
			return true;
		}else
			return false;
		
	}  // end of add student


//=========================================================
public RegStudent getRegStudentById(long enrollment){
	return null;
}  //method3

//seema

public List<RegStudent> getAllRegStudents(){
	
	List<RegStudent> regstulist =new ArrayList<RegStudent>();
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try {
		con = SisDbUtil.getConnection();
		String sql="select * from student";
		pstmt=con.prepareStatement(sql);
		 rs=pstmt.executeQuery();
		 while(rs.next()){
			
			 RegStudent regstudent=new RegStudent(); 
             
             regstudent.setName(rs.getString("name"));
             regstudent.setEnrollmemtNumber(Long.parseLong(rs.getString("enroll")));
             regstudent.setCourse(rs.getString("course"));
             regstudent.setBranch(rs.getString("branch"));
             regstudent.setSemester(rs.getInt("semester"));
             regstudent.setSelected(rs.getString("confirm"));
             regstulist.add(regstudent);
           
		 }
	} catch (Exception e) {
     e.printStackTrace();
	}
	return regstulist;

}

public List<RegStudent> getAllStuBy(String course, String branch, int sem){
	
	return null;
	
}

public int getSelectedStu(int number,String hostel,List<RegStudent> sortStuList){
	return number;
}


public List<RegStudent> getAllByCategory(String course, String branch, int sem,String category){
	return null;
}

public HashMap<String, Integer> getSelectedTabulation(String course, int semester,String[] branches){	
	return null;
}


public HashMap<String, Integer> getTotalTabulation(String course, int semester,String[] branches){
	return null;
}

public List<RegStudent> getAllSelectedStu(String hostel){
	return null;
}


@Override
public boolean confirmStudent(long enrollment) {
	Connection con=null;
	PreparedStatement pstmt=null;
	int  result=0;
	try {
		con = SisDbUtil.getConnection();
		String sql="update student set confirm=? where enroll=?";
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1,"yes");
		pstmt.setLong(2,enrollment);
		 result=pstmt.executeUpdate();
		
	} catch (Exception e) {
     e.printStackTrace();
	}
	if(result==1){
	return true;
	}else 
		return false;
}


@Override
public boolean deleteStudent(Long enroll) {
	// TODO Auto-generated method stub
	return false;
}

}  //class
