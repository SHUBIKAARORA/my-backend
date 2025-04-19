package iantdelhi.iant.service;

import iantdelhi.iant.repository.LoginCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private LoginCredentialsRepository loginRepository;

    public boolean authenticate(String email, String password) {
        return loginRepository.findByEmailAndPassword(email, password).isPresent();
    }
}