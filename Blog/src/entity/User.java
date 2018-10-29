package entity;

public class User {
	
	private int id;
	private String username;
	private String password;
	private String email;
	private boolean is_applied;
	private boolean is_delete;
	private boolean is_profile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isIs_applied() {
		return is_applied;
	}
	public void setIs_applied(boolean is_applied) {
		this.is_applied = is_applied;
	}
	public boolean isIs_delete() {
		return is_delete;
	}
	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}
	public boolean isIs_profile() {
		return is_profile;
	}
	public void setIs_profile(boolean is_profile) {
		this.is_profile = is_profile;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", is_applied=" + is_applied + ", is_delete=" + is_delete + ", is_profile=" + is_profile + "]";
	}

}
