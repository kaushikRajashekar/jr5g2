package com.cg.creditcard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.creditcard.entity.Statement;
@Repository
public interface StatementRepository extends JpaRepository<Statement, Integer>{

}
