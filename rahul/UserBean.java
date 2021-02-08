package n2s.ehc.rahul;

import java.util.Hashtable;

public class UserBean {
	public UserBean() {
		this.table = new Hashtable<Integer, String>();
	}
	private int option;
	private Hashtable<Integer, String> table;
	private Integer userId;
	private String userName;
	
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	public Hashtable<Integer, String> getTable() {
		return table;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
