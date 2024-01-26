package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		Optional<Account> op = accountRepository.findById(account.getAccno());
		if(op.isPresent()) {
			return "Account already exists";
		}else {
			accountRepository.save(account);
			return "Account created successfully";
		}
	}
	
	public String findBalance(int accno) {
		Optional<Account> op = accountRepository.findById(accno);
		if(op.isPresent()) {
			Account acc = op.get();
			return "Your balance with acc "+accno+" with amount is "+acc.getAmount();
		}else {
			return "Account not exists";
		}
	}
}
