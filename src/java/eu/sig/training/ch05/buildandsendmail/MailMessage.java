package eu.sig.training.ch05.buildandsendmail;

public class MailMessage {
	public String message;

	public MailMessage(String message) {
		this.message = message;
	}
	
	public String formatMessage( MailFont font ) {
		return font.format( this.message );
	}
}