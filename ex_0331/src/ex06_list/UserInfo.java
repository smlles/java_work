package ex06_list;

import java.util.Set;

public class UserInfo {
	private String id;
	private int pw;
	//get set
	 public void setId(String id) {
		this.id = id;
	} 
	 public void setPw(int pw) {
		this.pw = pw;
	}
	 public String getId() {
		return id;
	}
	 public int getPw() {
		return pw;
	}
	//.생성자
	/*public UserInfo(String id, int pw) {
		this.id = id;
		this.pw=pw;
	}*/
}
