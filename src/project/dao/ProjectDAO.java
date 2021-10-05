package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

		  
	   public List <EmpDTO> select (){
		   Connection con =null;
		   PreparedStatement pstmt= null;
		   ResultSet rs = null;
		   
		   List<EmpDTO>list = new ArrayList<EmpDTO>;
		    
		   try {
			   con = getConnection();
			   String sql = "select*from emp_temp order by hiredate dest";
			   pstmt = con.prepareStatement(sql);
			   rs= pstmt.executeQuery();
			   while(rs.next()) {
				   EmpDTO dto = new EmpDTO();
				   
			   }
		   }
		   
	   }
  }




