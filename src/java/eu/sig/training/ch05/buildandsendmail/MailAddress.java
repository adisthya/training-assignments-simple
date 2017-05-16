package eu.sig.training.ch05.buildandsendmail;

public class MailAddress {
	public Person person;
	public String division;

	public MailAddress(Person person, String division) {
		this.person = person;
		this.division = division;
	}
	
	public String getAddress() {
		return person.firstName.charAt(0) + "." + person.lastName.substring(0, 7) + "@"
	            + this.division.substring(0, 5) + ".compa.ny";
	}
}