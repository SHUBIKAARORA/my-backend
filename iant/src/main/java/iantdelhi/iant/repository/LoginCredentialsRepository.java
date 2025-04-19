package iantdelhi.iant.repository;

import iantdelhi.iant.model.LoginCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginCredentialsRepository extends JpaRepository<LoginCredentials, String> {
    Optional<LoginCredentials> findByEmailAndPassword(String email,String password);
    Optional<LoginCredentials> findByEmail(String email);
}
