package ex02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonMethod {
	// person 테이블에 데이터를 추가하는 add 메서드

	public static void add(int idx, String name, int age) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "Insert into person(idx,name,age) values (?,?,?) ";

		try {
			
			conn = DBUtill.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, idx);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			rs = pstmt.executeQuery();
			

			System.out.println("추가됨");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

	static public List<Person> find() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "Select IDX,NAME,AGE from PERSON";
		List<Person> list = new ArrayList<>();

		try {
			conn = DBUtill.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Person p = new Person();
				p.setIdx(rs.getInt("idx"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));
				list.add(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
}
