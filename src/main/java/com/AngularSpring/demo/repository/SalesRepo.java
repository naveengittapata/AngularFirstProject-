package com.AngularSpring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AngularSpring.demo.model.expences;
@Repository
public interface SalesRepo extends JpaRepository<expences, Long> {

}

