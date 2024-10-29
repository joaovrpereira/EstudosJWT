package com.joaovrpereira.spring_security_jwt.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public String authenticate(Authentication authentication){
        return "token";
    }
}
