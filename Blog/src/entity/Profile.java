package entity;

public class Profile {
	
	private String first_name;
	private String last_name;
	private boolean gender;
	private String telephone;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Profile [first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender + ", telephone="
				+ telephone + "]";
	}

}
