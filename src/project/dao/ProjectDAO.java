package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProjectDAO {

	

	public static Connection Getconnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();

		  
	   public List <ProjectEmpDTO> select (){
		   Connection con =null;
		   PreparedStatement pstmt= null;
		   ResultSet rs = null;
		   
		   List<ProjectEmpDTO>list = new ArrayList<ProjectEmpDTO>;
		    
		   try {
			   con = Getconnection();
			   String sql = "select*from emp_temp order by hiredate dest";
			   pstmt = con.prepareStatement(sql);
			   rs= pstmt.executeQuery();
			   while(rs.next()) {
				   ProjectEmpDTO dto = new ProjectEmpDTO();
				   
			   }
			   
			   
		   
	   
		   
	   }
  }




