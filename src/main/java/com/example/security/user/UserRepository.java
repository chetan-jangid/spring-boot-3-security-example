package com.example.security.user;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * The class should ideally bring data from database.
 * But for simplicity purposes and concentrating on security, we are saving and retrieving from instance variable.
 */
@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public Optional<User> findByEmail(String email) {
        return users.stream().filter(u -> u.getUsername().equals(email)).findFirst();
    }
}
