package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class projectEx {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void example() {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
