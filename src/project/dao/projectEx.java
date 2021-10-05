package project.dao;

import java.sql.Connection;

public class projectEx {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=null;
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
