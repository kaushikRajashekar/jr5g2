package com.cg.creditcard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.creditcard.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

}
