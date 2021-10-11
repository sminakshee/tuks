package com.slytherin.phase2.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "customerdetails")
public class UserProfile {
	    @Id
	    @GeneratedValue
	    private Long cust_id;
//	@NotBlank
	    private String first_name;
//	@NotBlank
	    private String last_name;
//	@NotBlank
	    private String email;
//	@NotBlank
    private Long phone_no;

	public UserProfile(){
	        super();
	    }
	public UserProfile(Long cust_id, String first_name, String last_name, String email, Long phone_no) {
	        super();
	        this.cust_id = cust_id;
	        this.first_name = first_name;
	        this.last_name = last_name;
	        this.email=email;
	        this.phone_no= phone_no;
	    }
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public static void delete(UserProfile user) {
		// TODO Auto-generated method stub
		
	}}
	
