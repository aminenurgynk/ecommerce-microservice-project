package com.aminenurgynk.repository;

import com.aminenurgynk.repository.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthRepository extends JpaRepository<Auth, Long> {
}
