package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
	private MailMan mailer;
	
    // tag::buildAndSendMail[]
    public void buildAndSendMail( MailAddress destination, MailBody body ) {
        mailer.send(destination, body);
    }
    // end::buildAndSendMail[]

}