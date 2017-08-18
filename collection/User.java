package com.corejava.collection;

public class User
{
	public User(String name, String passwd) {
		super();
		this.name = name;
		this.passwd = passwd;
	}
	
	private String name;
	private String passwd;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", passwd=" + passwd + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		User user=(User)obj;
		if(this.name ==user.name)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
