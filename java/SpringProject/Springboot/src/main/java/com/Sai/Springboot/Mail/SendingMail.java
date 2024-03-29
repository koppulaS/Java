package com.Sai.Springboot.Mail;



	import javax.mail.MessagingException;
	import javax.mail.internet.MimeMessage;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.mail.javamail.JavaMailSender;
	import org.springframework.mail.javamail.MimeMessageHelper;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
 
	@RestController
	@RequestMapping("/kiladi")
	public class SendingMail {
	    @Autowired
	    private JavaMailSender sender;

	    @RequestMapping("/sendMail")
	    public String sendMail() {
	        MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message);

	        try {
	            helper.setTo("koppulasaicharan@gmail.com");
	            helper.setText(":)");
	            helper.setSubject(" ");
	        } catch (MessagingException e) {
	            e.printStackTrace();
	            return "Error while sending mail ..";
	        }
	        sender.send(message);
	        return "Mail Sent Success!";
	    }
	}

