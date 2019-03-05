package mum.mpp.model;

import java.io.Serializable;

public class Person implements Serializable {

   public enum MemberAuthorization{
		ADMIN,
		LIBRARIAN,
		BOTH
   }
 

   public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public MemberAuthorization getAuthorizationLevel() {
		return authorizationLevel;
	}
	void setAuthorizationLevel(MemberAuthorization authorizationLevel) {
		this.authorizationLevel = authorizationLevel;
	}

	
	private String firstName;
	private String lastname;
	private String phoneNumber;
	private Address address;
	private MemberAuthorization authorizationLevel;
	
}
