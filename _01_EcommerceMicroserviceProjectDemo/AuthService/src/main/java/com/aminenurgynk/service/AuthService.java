package com.aminenurgynk.service;

import com.aminenurgynk.repository.IAuthRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final IAuthRepository iAuthRepository;

    public AuthService(IAuthRepository iAuthRepository) {
        this.iAuthRepository = iAuthRepository;
    }
}
