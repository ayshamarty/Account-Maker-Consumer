package com.bae.accountmaker.reciever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.accountmaker.persistence.domain.AccountToQueue;
import com.bae.accountmaker.persistence.repository.AccountMongoRepository;

@Component
public class AccountReceiver {

	@Autowired
	private AccountMongoRepository repository;

	@JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
	public void receiveMessage(AccountToQueue accountToQueue) {
		repository.save(accountToQueue);
	}
}
