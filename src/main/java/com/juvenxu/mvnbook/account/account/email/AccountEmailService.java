package com.juvenxu.mvnbook.account.account.email;

public interface AccountEmailService {
	void sendMail(String to,String subject,String htmlText) throws Exception;
}
