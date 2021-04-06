package com.cg.creditcard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.creditcard.entity.PaymentTransaction;
@Repository
public interface PaymentTransactionRepository extends JpaRepository<PaymentTransaction, Integer>{

}
