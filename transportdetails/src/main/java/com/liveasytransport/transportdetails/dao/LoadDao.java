package com.liveasytransport.transportdetails.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.liveasytransport.transportdetails.entities.*;
public interface LoadDao extends JpaRepository<Load,Long> {

}
