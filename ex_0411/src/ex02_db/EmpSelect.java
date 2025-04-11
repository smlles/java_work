package ex02_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class EmpSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
		
		EmpMethod em = new EmpMethod();
		List<Emp> list = em.find("MANAGER");
		for(Emp e : list) {
			System.out.printf("사번 : %d, 이름 : %s, 직무 : %s, 급여 : %d \n",e.getEmpno(),e.getEname(),e.getJob(),e.getSal());
		}
		
		/*
		try {
			conn = DBUtill.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from emp");
			//
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getInt("sal");
				System.out.printf("사번 : %d, 이름 : %s, 직무 : %s, 급여 : %.2f \n",empno,ename,job,sal);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}*/
	}
}
//