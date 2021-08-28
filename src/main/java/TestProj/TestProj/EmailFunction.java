/*package TestProj.TestProj;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EmailFunction {

	 public static void main(String[] args) throws EmailException, IOException, AddressException, MessagingException {
		final String emailD = emailPwd.deloitteID; //skrish1225@gmail.com
		final String password = emailPwd.deloittePwd; // 
		 String emailTo ="krishnas5@deloitte.com";
		 String smtpServer = "outlook.office365.com"; // smtp.googlemail.com
		 //String fileData = DatabaseFunction.readSQLFile("C:\\\\Users\\\\krishnas5\\\\eclipse-workspace\\\\TestProj\\\\pehalaReport1.html");
		 int port =587;  // 465   587
		 sendEmailReportWithAttachment(emailPwd.deloitteID, emailPwd.deloittePwd, "krishnas5@deloitte.com", "C:\\Users\\krishnas5\\eclipse-workspace\\TestProj\\pehalaReport1.html");
		

		    Properties props = new Properties();
		    props.put("mail.smtp.auth", true);
		    props.put("mail.smtp.starttls.enable", true);
		    props.put("mail.smtp.host", "smtp.deloitte.com");
		    props.put("mail.smtp.ssl.trust", "smtp.deloitte.com");
		    props.put("mail.smtp.port", "25");

		    Session session = Session.getInstance(props,
		            new javax.mail.Authenticator() {
		                protected PasswordAuthentication getPasswordAuthentication() {
		                    return new PasswordAuthentication(emailD, password);
		                }
		            });    

		        Message message = new MimeMessage(session);
		        message.setFrom(new InternetAddress("krishnas5@deloitte.com"));
		        message.setRecipients(Message.RecipientType.TO,
		                InternetAddress.parse("krishnas5@deloitte.com"));
		        message.setSubject("Testing Subject");
		        message.setText("Test email ");
		        
		        MimeBodyPart messageBodyPart = new MimeBodyPart();

		        Multipart multipart = new MimeMultipart();
		        messageBodyPart = new MimeBodyPart();
		        String file = "C:\\Users\\krishnas5\\eclipse-workspace\\TestProj\\pehalaReport1.html";
		        String fileName = "TestReport.html";
		        DataSource source = new FileDataSource(file);
		        messageBodyPart.setDataHandler(new DataHandler(source));
		        messageBodyPart.setFileName(fileName);
		        multipart.addBodyPart(messageBodyPart);
		        
		        message.setContent(multipart);

		        System.out.println("Sending");
		        Transport.send(message);

		        System.out.println("Done");

		    
		 //sendEmailReportWithAttachment(emailPwd.gmailAutomatedID, emailPwd.gmailAutomatedPwd, emailTo, "C:\\Users\\krishnas5\\eclipse-workspace\\TestProj\\pehalaReport1.html");
		// sendEmailReportWithAttachment(emailPwd.deloitteID, emailPwd.deloittePwd, emailTo, "C:\\Users\\krishnas5\\eclipse-workspace\\TestProj\\pehalaReport1.html");
		 
		 //Email email = new SimpleEmail();
		 //email.setHostName("smtp.googlemail.com");
		 //email.setSmtpPort(465);
		 //email.setAuthenticator(new DefaultAuthenticator("skrish1225@gmail.com", "9422335259"));
		 //email.setSSLOnConnect(true);
		 
			 email.setFrom("skrish1225@gmail.com");
			 email.setSubject("TestMail");
			 email.setMsg("This is a test mail ... :-)");
			 email.addTo("skrish1225@gmail.com");
			 email.send();
		 //========================================================
		 	
		 // Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("C:\\Users\\krishnas5\\eclipse-workspace\\TestProj\\pehalaReport1.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Report.html");
		  attachment.setName("Test Execution Report");
		  
		//  sendHtmlEmail(emailD, password, emailTo, smtpServer,port, fileData);
		  // Create the email message
		  MultiPartEmail email1 = new MultiPartEmail();
		  email1.setHostName(smtpServer);
		  email1.setSmtpPort(port);
		  email1.setSSL(true);
		  email1.setStartTLSEnabled(true);
		  
								  //email1.setAuthentication(emailD,password);//----
								  //email1.setSSLCheckServerIdentity(true);//-------
								  //email1.setStartTLSRequired(true); //------------
		  email1.setAuthenticator(new DefaultAuthenticator(emailD, password));
		  email1.setSSLOnConnect(true);
		  email1.addTo(emailTo, "Krishna");
		  email1.setFrom(emailD, "Test Execution Report");
		  email1.setSubject("Test Execution Reort");
		  email1.setMsg("Hi, Please find the attached test execution report");

		  // add the attachment
		  email1.attach(attachment);

		  // send the email
		  email1.send();
	 }
	 *//**
	  * This function sends an email with attachment.
	  * @param userNameFrom
	  * @param password
	  * @param To
	  * @param reportPath
	  * @throws EmailException
	  * @throws AddressException
	  * @throws MessagingException
	  *//*
	 public static void sendEmailReportWithAttachment(final String userNameFrom, final String password, String To, String reportPath) throws EmailException, AddressException, MessagingException {
		
		 String dt = java.time.LocalDate.now().toString();
		 if (userNameFrom.contains("deloitte")) {
			 Properties props = new Properties();
			    props.put("mail.smtp.auth", true);
			    props.put("mail.smtp.starttls.enable", true);
			    props.put("mail.smtp.host", "smtp.deloitte.com");
			    props.put("mail.smtp.ssl.trust", "smtp.deloitte.com");
			    props.put("mail.smtp.port", "25");

			    Session session = Session.getInstance(props,
			            new javax.mail.Authenticator() {
			                protected PasswordAuthentication getPasswordAuthentication() {
			                    return new PasswordAuthentication(userNameFrom, password);
			                }
			            });  		 
			    Message message = new MimeMessage(session);
		        message.setFrom(new InternetAddress(userNameFrom));
		        message.setRecipients(Message.RecipientType.TO,
		                InternetAddress.parse(To));		        
		        message.setSubject("Test Execution Report - "+dt);
		        
		        String msgText = "Dear All, \n \n Refer the attached test execution report, generated on "+dt+ ". \n \n Please let me know if more informaiton is needed. \n \n Thanks.";
		       		 
		        
		        BodyPart messageBodyPart1 = new MimeBodyPart();  
		        messageBodyPart1.setText(msgText);  
		        
		        
		        
		        MimeBodyPart messageBodyPart = new MimeBodyPart();
		        Multipart multipart = new MimeMultipart();
		        messageBodyPart = new MimeBodyPart();		        
		        DataSource source = new FileDataSource(reportPath);
		        messageBodyPart.setDataHandler(new DataHandler(source));
		        messageBodyPart.setFileName("TestReport.html");
		        multipart.addBodyPart(messageBodyPart1);
		        multipart.addBodyPart(messageBodyPart);		
		        
		        
		        message.setContent(multipart);
		        System.out.println("Sending email to "+To+ " from "+userNameFrom);
		        Transport.send(message);
		        System.out.println("Message Sent to "+To);
			 
		}else {
			System.out.println("Please enter a valid email ID which belongs to deloitte.com domain");
		}
		 
	 }
	 public static void sendHtmlEmail(String userNameFrom, String password, String To, String smtpServer, int port, String htmlText) throws EmailException, MalformedURLException {
		// Create the email message
		  HtmlEmail email = new HtmlEmail();
		  email.setHostName(smtpServer);
		  email.setSmtpPort(port);
		  email.setAuthenticator(new DefaultAuthenticator(userNameFrom, password));
		  email.setSSLOnConnect(true);
		  email.addTo(To, "Test Report");
		  email.setFrom(userNameFrom, userNameFrom);
		  email.setSubject("Test Report");
		  
		  // embed the image and get the content id
		  //URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
		  //String cid = email.embed(url, "Apache logo");
		  
		  // set the html message
		  email.setHtmlMsg(htmlText);

		  // set the alternative message
		  email.setTextMsg("Your email client does not support HTML messages");

		  // send the email
		  email.send();

	 }
}
*/