package eu.sig.training.ch05.buildandsendmail;

public class MailBody {
	public String subject;
	public String message;
	public MailFont font;

	public MailBody(String subject, MailMessage message) {
		this.subject = subject;
		this.message = message.formatMessage( this.font );
	}
}