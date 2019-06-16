package pojo;

public class Automate {
	String firstName;
	
	public Automate(String firstName, String lastName, String email, String password, String confirmPassword,
			String street, String street1, String city, String state, String postalcode, String cardnumebr) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		ConfirmPassword = confirmPassword;
		Street = street;
		Street1 = street1;
		City = city;
		State = state;
		this.postalcode = postalcode;
		this.cardnumebr = cardnumebr;
	}
	String lastName;
	String email;
	String password;
	String ConfirmPassword;
	String Street;
	
	String Street1;
	String City;
	String State;
	String postalcode;
	String cardnumebr;
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getStreet1() {
		return Street1;
	}
	public void setStreet1(String street1) {
		Street1 = street1;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getCardnumebr() {
		return cardnumebr;
	}
	public void setCardnumebr(String cardnumebr) {
		this.cardnumebr = cardnumebr;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ConfirmPassword == null) ? 0 : ConfirmPassword.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automate other = (Automate) obj;
		if (ConfirmPassword == null) {
			if (other.ConfirmPassword != null)
				return false;
		} else if (!ConfirmPassword.equals(other.ConfirmPassword))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	

}
