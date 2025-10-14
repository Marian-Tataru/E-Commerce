package com.backend.Controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.Service.TokenGeneratorService;


@RestController
@RequestMapping("/api")
public class AuthzController {

    private TokenGeneratorService tokenGeneratorService ;
    public AuthzController(TokenGeneratorService tokenGeneratorService){
        this.tokenGeneratorService = tokenGeneratorService;
    }

    @PostMapping("/authz")
    public String authorize(Authentication auth) {
        String token = tokenGeneratorService.generateToken(auth);
        return token ;        
    }
    
}
