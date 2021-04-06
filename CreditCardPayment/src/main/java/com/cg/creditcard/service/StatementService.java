package com.cg.creditcard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.creditcard.dao.StatementRepository;
import com.cg.creditcard.entity.Statement;

@Service
public class StatementService implements IStatementService {
	@Autowired
	StatementRepository dao;

	@Override
	public Statement getStatement(int userid) {
		return dao.findById(userid).orElse(null);
	}

	@Override
	public List<Statement> getAllStatement() {
		List<Statement>statementList=dao.findAll();
		return statementList;
	}
	
	

}
