package project.dao;

public class ProjectDAO {
<<<<<<< HEAD
	
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	} 
	
	
=======
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
>>>>>>> branch 'master' of https://github.com/TaeWonEom97/Project.git
}
