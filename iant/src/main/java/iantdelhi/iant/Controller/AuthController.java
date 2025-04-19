package iantdelhi.iant.Controller;


import iantdelhi.iant.service.AuthService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> payload, HttpSession session) {
        String email = payload.get("email");
        String password = payload.get("password");

        boolean valid = authService.authenticate(email, password);

        if (valid) {
            session.setAttribute("email", email); // Save session
            Map<String, String> response = new HashMap<>();
            response.put("message", "Login successful");
            response.put("redirect", "/dashboard"); // Send this info to React
            return ResponseEntity.ok(response); // Send back a JSON object
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    @GetMapping("/session")
    public ResponseEntity<?> checkSession(HttpSession session) {
        String email = (String) session.getAttribute("email");
        if (email != null) {
            return ResponseEntity.ok("User is logged in as: " + email);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Not logged in");
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpSession session) {
        session.invalidate();
        return ResponseEntity.ok("Logged out");
    }
}