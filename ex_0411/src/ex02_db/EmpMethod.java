package ex02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {
	//emp테이블에서 사번(empno),이름(ename),직종(job),급여(sal)
	//을 조회해서 하나의 행을 emp객체에 넣은 후 그 객체들을 arrayList에 담아 반환하기
	
	static public List<Emp> find(String job) {
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "Select empno,ename,job,sal from emp where job= ?";
		List<Emp> list = new ArrayList<>();
		
		
		try {
			conn = DBUtill.getConnection();
			pstmt = conn.prepareStatement(sql);
			//첫 물음표 자리에 매개변수로 들어온 job으로 채워라
			pstmt.setString(1, job);
			rs = pstmt.executeQuery();
		while(rs.next()) {
			Emp e = new Emp();
			e.setEmpno(rs.getInt("empno"));
			e.setEname(rs.getString("ename"));
			e.setJob(rs.getString("job"));
			e.setSal(rs.getInt("sal"));
			list.add(e);
		}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}  
				
			}
		return list;
		}
	}

